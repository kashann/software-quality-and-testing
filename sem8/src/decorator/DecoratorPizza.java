package decorator;

public abstract class DecoratorPizza extends APizza{
	protected APizza pizza;

	public DecoratorPizza(APizza pizza) {
		super();
		this.pizza = pizza;
	}
	
	@Override
	public String getComponents() {
		return pizza.getComponents();
	}
	
	@Override
	public int getPrice() {
		return pizza.getPrice();
	}
}
