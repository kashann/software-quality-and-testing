package observer;

public class Manager implements IObserver{

	@Override
	public void process() {
		System.out.println("The manager is recieving the information. He will solve it!");
	}

}
