package Flyweight;

public class ClientCheckInfo {
	//the un-share part of the object
	private String clientName;
	private float cost;
	
	public ClientCheckInfo(String clientName, float cost) {
		super();
		this.clientName = clientName;
		this.cost = cost;
	}

	public String getClientName() {
		return clientName;
	}

	public float getCost() {
		return cost;
	};
}
