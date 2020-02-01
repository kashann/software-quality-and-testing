package mediatorDesignPattern;

public class WebUser extends User{

	@Override
	public void recieveMessage(String message) {
		System.out.println("userul " + this.nume + "a primit mesajul (WEB): " + message);
	}

}
