
public class CrownDecorator extends DecoratorPizza{

	public CrownDecorator(APizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
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
