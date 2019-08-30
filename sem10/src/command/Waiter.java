package command;

import java.util.ArrayList;

public class Waiter {
	//class invoker from the diagram Command DP
	private ArrayList<ICommand> commandList = new ArrayList<>();
	
	public void takeCommand(ICommand c) {
		commandList.add(c);
	}
	
	public void sendAllCommands() {
		for(ICommand c:commandList) {
			c.cook();
		}
		commandList.clear();
	}
}
