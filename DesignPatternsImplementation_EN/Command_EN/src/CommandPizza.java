
public class CommandPizza implements ICommand{
	private String pizzaType;
	private Cook cook;
	
	public CommandPizza(String pizzaType, Cook cook) {
		super();
		this.pizzaType = pizzaType;
		this.cook = cook;
	}

	@Override
	public void cook() {
		cook.cookPizza(pizzaType);
	}

}
