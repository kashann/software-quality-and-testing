package Structurale.Decorator;

public abstract class DecoratorPizza extends AbstractPizza{ //decorator
	protected final AbstractPizza pizza;
	
	public DecoratorPizza(AbstractPizza Pizza) {
		this.pizza = Pizza;
	}

	@Override
	public String getIngrediente() {
		return pizza.getIngrediente();
	}
	
}
