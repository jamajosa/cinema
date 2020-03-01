import domain.user.MailAdapter;
import domain.user.NotifyService;
import domain.user.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Businesstests {

	@Test
	void DoesTheStatesChange() {
		Userfactory factory = new Userfactory();
		User user = factory.makeUser("D","Richard");
		NotifyService n = new MailAdapter();
		n.setCredentials("email@email.nl");
		user.addNotifyMedium(n);
		Assertions.assertEquals(n.notify("Hello"), "Hello email@email.nl");
	}
}

