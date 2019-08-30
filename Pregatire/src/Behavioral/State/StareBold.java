package Behavioral.State;

public class StareBold implements IState{

	@Override
	public void print(String text) {
		System.out.println("BOLD: " + text);
	}

}
