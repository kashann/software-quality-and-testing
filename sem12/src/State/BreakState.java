package State;

public class BreakState implements IState {

	@Override
	public void action(String message) {
		System.out.println("I'm out. Be there in 5 min!");
	}
}
