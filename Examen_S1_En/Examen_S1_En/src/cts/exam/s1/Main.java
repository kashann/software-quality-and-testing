package cts.exam.s1;

import cts.exam.s1.pattern1.MasterCard;
import cts.exam.s1.pattern1.PayPal;
import cts.exam.s1.pattern1.TreiDeSecure;
import cts.exam.s1.pattern1.Visa;
import cts.exam.s1.pattern2.Builder;
import cts.exam.s1.pattern2.EBedType;
import cts.exam.s1.pattern2.HotelRoom;
import cts.exam.s1.pattern3.ETicket;
import cts.exam.s1.pattern3.OnlineTicket;
import cts.exam.s1.pattern3.OnlineTicketFactory;

public class Main {

	public static void main(String[] args) {
		OnlineTicketFactory factory = new OnlineTicketFactory();		
		OnlineTicket concert = factory.factory(ETicket.CONCERT, "rhcp", 1);
		OnlineTicket event = factory.factory(ETicket.EVENT, "brutal stacs", 2);
		OnlineTicket museum = factory.factory(ETicket.MUSEUM, "moma", 3);
		concert.displayTicket();
		event.displayTicket();
		museum.displayTicket();
		
		HotelRoom room1 =  new Builder().floor(1).noPersons(2).bedType(EBedType.DOUBLE).seasideView(true).build();
		System.out.println(room1);
		HotelRoom room2 = new Builder().floor(6).noPersons(1).build();
		System.out.println(room2);
		
		TreiDeSecure tds = new TreiDeSecure();
		Visa visa = new Visa("VisaProcessor");
		MasterCard mc = new MasterCard("MCProcessor");
		PayPal pp = new PayPal("PPProcessor");
		Visa v = new Visa("VProcessor");
		tds.addProcessor(v);
		tds.addProcessor(mc);
		tds.addProcessor(pp);
		tds.onlinePay();
		tds.addProcessor(visa);
	}

}
