package tiago.finotti.airticket.tests;

import org.junit.Assert;
import org.junit.Test;

import com.cc.airline.passengers.Passenger;
import com.cc.airline.passengers.PassengerName;
import com.cc.airline.ticketing.Seat;
import com.cc.airline.ticketing.Ticket;

public class TicketTest {

	@Test
	public void testTicket() {
		Passenger passenger = new Passenger(new PassengerName("Mary","I","Worth"));
		Seat seat = new Seat();
		seat.setRow(1);
		seat.setLetter('B');
		int price = 1000;
		
		Ticket ticket = new Ticket(passenger, seat, price);
		
		Assert.assertTrue(ticket.getTicketNo() > 1000000 );
	}
	
	@Test( expected=Exception.class)
	public void testTicketBad() {
	Ticket ticket = new Ticket(null, new Seat(), -100);
	Assert.assertTrue(ticket.getTicketNo() > 1000000 );
	}

}
