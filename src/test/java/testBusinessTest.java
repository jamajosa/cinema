import domain.backlog.BacklogItem;
import domain.backlog.Doing;
import domain.backlog.Done;
import domain.backlog.ToDo;
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
		NotifyService a = new MailAdapter();
		NotifyService n = new MailAdapter();
		a.setCredentials("username");
		n.setCredentials("email@email.nl");
		user.addNotifyMedium(n);
		Assertions.assertEquals(n.notify("Hello"), "Hello email@email.nl");
		Assertions.assertEquals(n.notify("Hello"), "slack : Hello for username");
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
}

