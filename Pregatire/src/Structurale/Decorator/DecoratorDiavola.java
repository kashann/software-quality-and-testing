package Structurale.Decorator;

public class DecoratorDiavola extends DecoratorPizza{
	//concrete decorator
	public DecoratorDiavola(AbstractPizza Pizza) {
		super(Pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getIngrediente() {
		// TODO Auto-generated method stub
		return super.getIngrediente() + ", ardei iute";
	}
	
}
