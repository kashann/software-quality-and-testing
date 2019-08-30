package chainOfResponsability;

public class TestChainOfResponsability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Waiter waiter = new Waiter();
		Cook cook = new Cook();
		//we created the chain of responsability
		waiter.setNextHandler(cook);
		
		Command command1 = new Command("Coffee", 4);
		Command command2 = new Command("Pizza", 10);
		
		System.out.println("COMMAND 1");
		waiter.process(command1);
		System.out.println("COMMAND 2");
		waiter.process(command2);
	}

}
