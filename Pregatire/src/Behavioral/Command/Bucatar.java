package Behavioral.Command;

public class Bucatar {
	private String nume;
	
	public Bucatar(String nume) {
		this.nume = nume;
	}
	
	public void preparePizza(String tipPizza) {
		System.out.println("A fost preparata pizza " + tipPizza);
	}
	
	public void prepareSoup(String tipSupa) {
		System.out.println("A fost preparata supa " + tipSupa);
	}
}
