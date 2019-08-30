package State;

public class WorkState implements IState {
	
	@Override
	public void action(String message) {
		System.out.println("I will solve it right away!");
	}
}
