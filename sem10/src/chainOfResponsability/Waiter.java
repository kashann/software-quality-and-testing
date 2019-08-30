package chainOfResponsability;

public class Waiter extends AHandler{

	@Override
	public void process(Command c) {
		// TODO Auto-generated method stub
		if(c.getLevel() <= 5) {
			System.out.println("The waiter is serving " + c.getName());
		}
		else {
			System.out.println("The waiter cannot handle " + c.getName());
			if(this.nextHandler != null) {
				this.nextHandler.process(c);
			}
		}
			
	}
	
}
