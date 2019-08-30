package cts.exam.s1.pattern3;

public class ConcertTicket extends OnlineTicket{
	
	

	public ConcertTicket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConcertTicket(String eventName, int ticketNumber) {
		super(eventName, ticketNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "concert";
	}

}
