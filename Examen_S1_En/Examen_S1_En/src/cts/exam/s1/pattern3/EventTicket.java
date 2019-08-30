package cts.exam.s1.pattern3;

public class EventTicket extends OnlineTicket{

	public EventTicket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EventTicket(String eventName, int ticketNumber) {
		super(eventName, ticketNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "event";
	}

}
