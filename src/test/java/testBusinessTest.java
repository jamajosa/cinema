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
	void DoesTheStatesChangeTest() {
		Userfactory factory = new Userfactory();
		User user = factory.makeUser("D","Richard");
		User user2 = factory.makeUser("S","Olaf");
		NotifyService a = new SlackAdapter();
		NotifyService n = new MailAdapter();
		a.setCredentials("username");
		n.setCredentials("email@email.nl");
		user.addNotifyMedium(n);
		user.addNotifyMedium(a);
		Assertions.assertEquals(n.notify("Hello"), "Hello email@email.nl");
		Assertions.assertEquals(a.notify("Hello"), "slack : Hello for username");
	}

	@Test
	void TestDoesItemStateChangesTest() {
		BacklogItem backlogitem = new BacklogItem();
		backlogitem.setCurrentPhase(new ToDo());
		Assertions.assertEquals(backlogitem.getCurrentPhase() instanceof ToDo, true);

		backlogitem.setCurrentPhase(new Doing());
		Assertions.assertEquals(backlogitem.getCurrentPhase() instanceof ToDo, false);

		backlogitem.setCurrentPhase(new Done());
		Assertions.assertEquals(backlogitem.getCurrentPhase() instanceof Done, true);
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
		Assertions.assertEquals(build instanceof BuildResult, true);
		Assertions.assertEquals(build.isStatus(), true);
	}
}

