package cts.exam.s1.pattern3;

public abstract class OnlineTicket {
	String eventName;
	int ticketNumber;
	
	public OnlineTicket() {
		super();
	}
	
	public OnlineTicket(String eventName, int ticketNumber) {
		super();
		this.eventName = eventName;
		this.ticketNumber = ticketNumber;
	}
	
	public abstract String getType();

	public void displayTicket(){
		System.out.println(String.format("It's a %s type ticket for %s with a price of %d", this.getType(), eventName, ticketNumber));
		//System.out.println("It's a " + this.getType() + " type ticket for " eventName + " with a price of " + ticketNumber);
	}
}
