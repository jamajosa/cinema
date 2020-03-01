import domain.backlog.BacklogItem;
import domain.backlog.Doing;
import domain.backlog.Done;
import domain.backlog.ToDo;
import domain.pipeline.*;
import domain.reporting.BuildResult;
import domain.user.MailAdapter;
import domain.user.NotifyService;
import domain.user.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class testBusinessTest {

	@Test
	void DoesTheAdapterWorkTest() {
		Userfactory factory = new Userfactory();
		User user = factory.makeUser("D","Richard");
		User user2 = factory.makeUser("S","Olaf");
		User user3 = factory.makeUser("P","Pieter");
		NotifyService a = new SlackAdapter();
		NotifyService n = new MailAdapter();
		a.setCredentials("username");
		n.setCredentials("email@email.nl");
		user.addNotifyMedium(n);
		user2.addNotifyMedium(a);
		Assertions.assertEquals(n.notify("Hello"), "Hello email@email.nl");
		Assertions.assertEquals(a.notify("Hello"), "slack : Hello for username");
	}

	@Test
	void DoesTheFactoryWorkTest(){
		Userfactory factory = new Userfactory();
		User user = factory.makeUser("D","Richard");
		User user2 = factory.makeUser("S","Olaf");
		User user3 = factory.makeUser("P","Pieter");
		Assertions.assertTrue(user3 instanceof ProductOwner);
		Assertions.assertTrue(user2 instanceof ScrumMaster);
		Assertions.assertTrue(user instanceof Developer);
	}

	@Test
	void TestDoesItemStateChangesTest() {
		BacklogItem backlogitem = new BacklogItem();
		backlogitem.setCurrentPhase(new ToDo());
		Assertions.assertTrue(backlogitem.getCurrentPhase() instanceof ToDo);

		backlogitem.setCurrentPhase(new Doing());
		Assertions.assertTrue(backlogitem.getCurrentPhase() instanceof Doing);

		backlogitem.setCurrentPhase(new Done());
		Assertions.assertTrue(backlogitem.getCurrentPhase() instanceof Done);
	}

	@Test
	void PipelineRuns() {
		Pipeline pl = new Pipeline();
		pl.setPipelineSettings(
				new GithubAdapter(),
				new NoAnalysis(),
				new NoPackages(),
				new AntAdapter(),
				new NUnitAdapter(),
				new AzureAdapter(),
				new NoUtility()
		);

		BuildResult build = pl.runPipeline();
		Assertions.assertTrue(build.isStatus());
	}
}

