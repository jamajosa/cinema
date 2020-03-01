import domain.user.MailAdapter;
import domain.user.NotifyService;
import domain.user.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class testBusinesstest {

	@Test
	void TestDoesTheStatesChangeTest() {
		Userfactory factory = new Userfactory();
		User user = factory.makeUser("D","Richard");
		NotifyService n = new MailAdapter();
		n.setCredentials("email@email.nl");
		user.addNotifyMedium(n);
		Assertions.assertEquals(n.notify("Hello"), "Hello email@email.nl");
	}
}

