package decorator;

public class CrownDecorator extends DecoratorPizza{
	public CrownDecorator(APizza pizza) {
		super(pizza);
	}
	
	@Override
	public String getComponents() {
		return super.getComponents() + ", crown";
	}
	
	@Override
	public int getPrice() {
		return super.getPrice() + 10;
	}
}
