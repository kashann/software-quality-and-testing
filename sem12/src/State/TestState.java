package State;

public class TestState {
	public static void main(String[] args) {
		Worker worker = new Worker("Gigel");
		worker.react("Fix problem at the kitchen");
		worker.setCurrentState(new BreakState());
		worker.react("Fix problem at the kitchen");
		worker.setCurrentState(new VacationState());
		worker.react("Fix problem at the kitchen");
	}
}
