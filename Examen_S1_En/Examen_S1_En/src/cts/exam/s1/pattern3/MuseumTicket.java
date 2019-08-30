package cts.exam.s1.pattern3;

public class MuseumTicket extends OnlineTicket{
	
	public MuseumTicket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MuseumTicket(String eventName, int ticketNumber) {
		super(eventName, ticketNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "museum";
	}

}
