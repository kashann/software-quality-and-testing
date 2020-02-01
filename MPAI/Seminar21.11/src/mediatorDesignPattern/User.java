package mediatorDesignPattern;

public abstract class User {
	String nume;
	Mediator mediator;
	
	public abstract void recieveMessage(String message);
}
