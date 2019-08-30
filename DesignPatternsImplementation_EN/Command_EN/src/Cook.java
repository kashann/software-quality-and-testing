
public class Cook {
	//the receiver class
	private String name;

	public Cook(String name) {
		super();
		this.name = name;
	}
	
	public void cookPizza(String pizzaType) {
		System.out.println("The cook is making pizza " + pizzaType);
	}
	
	public void cookPasta(String pastaType, boolean isHot) {
		System.out.println("The cook is making pasta " + pastaType);
	}
}
