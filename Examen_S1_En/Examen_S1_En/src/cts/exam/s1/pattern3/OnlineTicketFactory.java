package cts.exam.s1.pattern3;

public class OnlineTicketFactory {
	
	public OnlineTicketFactory() {
		super();
	}
	
	public OnlineTicket factory(ETicket type, String name, int nr) {
		OnlineTicket ticket = null;
		switch(type) {
		case CONCERT:
			ticket = new ConcertTicket(name, nr);
			break;
		case EVENT:
			ticket = new EventTicket(name, nr);
			break;
		case MUSEUM:
			ticket = new MuseumTicket(name, nr);
			break;
		}
		return ticket;
	}
}
