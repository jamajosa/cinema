package domain;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OrderTest {
	
	Movie m = new Movie("Alladin");
	LocalDateTime weekend = LocalDateTime.of(2022, Month.FEBRUARY, 8, 19, 30, 40);
	LocalDateTime week = LocalDateTime.of(2022, Month.FEBRUARY, 5, 19, 30, 40);
	MovieScreening msweek = new MovieScreening(m,week,10.0);	
	MovieScreening msweekend = new MovieScreening(m,weekend,10.0);	
	MovieTicket mtn = new MovieTicket(msweek,false,1,1);
	MovieTicket mtn1 = new MovieTicket(msweek,false,1,1);
	MovieTicket mtn2 = new MovieTicket(msweek,false,1,1);
	MovieTicket mtn3 = new MovieTicket(msweek,false,1,1);
	MovieTicket mtn4 = new MovieTicket(msweek,false,1,1);
	MovieTicket mtn5 = new MovieTicket(msweek,false,1,1);
	MovieTicket mtp = new MovieTicket(msweek,true,1,1);
	
	//MovieTicket mtn = new MovieTicket(ms,false,1,1);
	@Test
	void test3studentTickets() {
		Order order3TicketsStudent = new Order(1,true);
		System.out.println("======TEST ONE EXECUTED=======");
		order3TicketsStudent.addSeatReservation(mtn);
		order3TicketsStudent.addSeatReservation(mtn1);
		order3TicketsStudent.addSeatReservation(mtn2);
        Assertions.assertEquals( 20.0 , order3TicketsStudent.calculatePrice());
	}
	@Test
	void studentPremium() {
		Order premiumstudent = new Order(1,true);
		System.out.println("======TEST TWO EXECUTED=======");
		premiumstudent.addSeatReservation(mtp);
        Assertions.assertEquals( 12.0 , premiumstudent.calculatePrice());
	}

}
