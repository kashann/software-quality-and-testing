package Behavioral.Command;

public class TestCommand {
	
	public static void main(String[] args) {
		Bucatar bucatar = new Bucatar("Gigel");
		ComandaBucatarie pizza = new ComandaPizza(bucatar, "Margherita");
		ComandaBucatarie supa = new ComandaSupa(bucatar, "Burta");
		Chelner waiter = new Chelner(2);
		waiter.preiaComanda(pizza);
		waiter.preiaComanda(supa);
		waiter.trimiteComenzi();
	}	
}
