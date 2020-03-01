import domain.user.MailAdapter;
import domain.user.NotifyService;
import domain.user.*;
import org.junit.jupiter.api.Assertions;

class Businesstests {


	//	//MovieTicket mtn = new MovieTicket(ms,false,1,1);
//	@Test
	void DoesTheStatesChange() {
		Userfactory factory = new Userfactory();
		User user = factory.makeUser("D","Richard");
		NotifyService n = new MailAdapter();
		n.setCredentials("email@email.nl");
		user.addNotifyMedium(n);
		Assertions.assertEquals(n.notify("hello"), "Hello email@email.nl");
	}
}
//	@Test
//	void studentPremium() {
//		Order premiumstudent = new Order(1,true);
//		System.out.println("======TEST TWO EXECUTED=======");
//		premiumstudent.addSeatReservation(mtp);
//        Assertions.assertEquals( 12.0 , premiumstudent.calculatePrice());
//	}
//
//}
