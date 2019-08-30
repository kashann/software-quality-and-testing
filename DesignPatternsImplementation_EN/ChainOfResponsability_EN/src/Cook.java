
public class Cook extends AHandler{

	@Override
	public void process(Command c) {
		if(c.getLevel() > 5)
			System.out.println("The cook solved the order "+c.getName());
	}

}
