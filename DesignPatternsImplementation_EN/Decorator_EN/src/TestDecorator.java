
public class TestDecorator {

	public static void main(String[] args) {
		APizza pizza = new PizzaRomana();
		System.out.println("Without decorator");
		System.out.println(pizza.getComponents());
		System.out.println(pizza.getPrice());
		
		APizza decoratedPizza = new CrownDecorator(pizza);
		System.out.println("Using decorator");
		System.out.println(decoratedPizza.getComponents());
		System.out.println(decoratedPizza.getPrice());
	}

}
