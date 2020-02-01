package mediatorDesignPattern;

import java.util.List;

public class Chat implements Mediator {
	List<User> utilizatori;
	
	public void addUser(User utilizator) {
		utilizatori.add(utilizator);
	}

	@Override
	public void sendMessage(User[] utilizatori, String message) {
		// TODO Auto-generated method stub
		
	}

}
