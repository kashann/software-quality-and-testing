package cts.exam.s1.unittesting;

public class NormalTicket {
	String eventName;
	int ticketNumber;
	
	public NormalTicket(String eventName, int ticketNumber) {
		super();
		this.eventName = "Test";
		this.ticketNumber = ticketNumber;
	}
	
	
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public void setTicketNumber(int ticketNumber) {
		ticketNumber = ticketNumber;
	}


	public String getEventName() {
		return eventName;
	}


	public int getTicketNumber() {
		return ticketNumber;
	}


	public void displayTicket(){
		System.out.println(String.format("It's ticket for {0} with a price of {1}", eventName, ticketNumber));
	}
}
