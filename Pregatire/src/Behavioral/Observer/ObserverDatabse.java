package Behavioral.Observer;

public class ObserverDatabse implements IObserver{ //concrete observer

	@Override
	public void doClick() {
		System.out.println("Connecting to database...");
	}

}
