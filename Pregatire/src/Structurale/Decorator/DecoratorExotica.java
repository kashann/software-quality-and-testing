package Structurale.Decorator;

public class DecoratorExotica extends DecoratorPizza{
	//concrete decorator
	public DecoratorExotica(AbstractPizza Pizza) {
		super(Pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getIngrediente() {
		// TODO Auto-generated method stub
		return super.getIngrediente() + ", ananas";
	}

	
}
