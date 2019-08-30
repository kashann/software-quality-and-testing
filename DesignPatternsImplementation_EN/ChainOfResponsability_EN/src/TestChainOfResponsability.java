
public class TestChainOfResponsability {

	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		Cook cook = new Cook();
		//we created the chain of resposability
		waiter.setNextHandler(cook);
		
		Command command1 = new Command("Coffee", 4);
		Command command2 = new Command("Pizza", 10);
		
		System.out.println("COMMAND1");
		waiter.process(command1);
		System.out.println("COMMAND2");
		waiter.process(command2);
	}

}
