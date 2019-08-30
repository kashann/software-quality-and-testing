package observer;

public class Cook implements IObserver{

	@Override
	public void process() {
		System.out.println("The cook recieved the info");
	}

}
