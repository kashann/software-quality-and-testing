package observer;

public class TestObserver {
	public static void main(String[] args) {
		Event event = new Event("Offer for sea food at Cora");
		
		//observers
		Manager manager = new Manager();
		Cook cook1 = new Cook();
		Cook cook2 = new Cook();
		
		//add the observers to the event
		event.addObserver(manager);
		event.addObserver(cook1);
		event.addObserver(cook2);
		
		//notify the fact that the event happened
		event.announce();
	}
}
