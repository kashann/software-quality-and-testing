package State;

public class Worker {
	private String name;
	private IState currentState;
	
	public Worker(String name) {
		super();
		this.name = name;
		//the default state
		this.currentState = new WorkState();
	}

	public void setCurrentState(IState currentState) {
		//depending on the current state and next state
		//if(this.currentState == EState.BREAK && currentState == EState.WORK)
		this.currentState = currentState;
	}
	
	public void react(String message) {
		this.currentState.action(message);
	}
}
