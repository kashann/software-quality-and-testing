package Behavioral.State;

public class StateNormal implements IState{

	@Override
	public void print(String text) {
		System.out.println("NORMAL: " + text);
	}

}
