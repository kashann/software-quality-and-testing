package observer;

public class Event extends AObservable{
	private String message;
	private boolean isAnnounced;
	
	public Event(String message) {
		super();
		this.message = message;
		this.isAnnounced = false;
	}
	
	public void announce() {
		if(isAnnounced == false) {
			System.out.println("Event: " + message);
			this.isAnnounced = true;
			this.notifyAllObservers();
		}
	}
}
