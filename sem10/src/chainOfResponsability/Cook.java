package chainOfResponsability;

public class Cook extends AHandler{

	@Override
	public void process(Command c) {
		// TODO Auto-generated method stub
		if(c.getLevel() > 5)
			System.out.println("The cook solved the order " + c.getName());
	}

}
