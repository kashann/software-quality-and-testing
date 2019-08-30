package State;

public class VacationState implements IState {

	@Override
	public void action(String message) {
		System.out.println("No way. I'm on a holiday!");
	}
}
