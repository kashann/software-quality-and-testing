package Behavioral.Observer;

public class ObserverLogin implements IObserver{ //concrete observer

	@Override
	public void doClick() {
		System.out.println("Opening Login window...");
	}

}
