package adapterClassesVsObjects;

public class Client {
	private String name;
	private int noEvents;
	private int[] eventsCost;
	
	public Client(String name, int noEvents, int[] eventsCost) {
		super();
		this.name = name;
		this.noEvents = noEvents;
		this.eventsCost = eventsCost;
	}

	public int getNoEvents() {
		return noEvents;
	}

	public int[] getEventsCost() {
		return eventsCost;
	}
	
	public int getEventCost(int i) {
		return eventsCost[i];
	}
}
