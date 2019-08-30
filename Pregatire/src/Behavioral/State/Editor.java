package Behavioral.State;

public class Editor { //context
	IState currentState;
	
	public Editor() {
		currentState = new StateNormal();
	}
	
	public void setStare(String stare) {
		if(stare.equals("normal"))
			this.currentState = new StateNormal();
		else if(stare.equals("bold"));
			this.currentState = new StareBold();
	}
	
	public void afisare(String text) {
		this.currentState.print(text);
	}
}
