package mediatorDesignPattern;

public class MobileUser extends User{

	@Override
	public void recieveMessage(String message) {
		System.out.println("userul " + this.nume + "a primit mesajul (MOBILE): " + message);
	}

}
