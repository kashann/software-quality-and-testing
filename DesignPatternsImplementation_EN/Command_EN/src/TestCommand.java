
public class TestCommand {

	public static void main(String[] args) {
		Cook cook = new Cook("Cook1");
		
		Waiter waiter = new Waiter();
		
		ICommand c1 = new CommandPizza("Italiana", cook);
		ICommand c2 = new CommandPasta("Carbonara", true, cook);
		
		waiter.takeCommand(c1);
		waiter.takeCommand(c2);
		
		//after some time
		waiter.sendAllCommands();
	}

}
