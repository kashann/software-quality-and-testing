package mediatorDesignPattern;

public class DesktopUser extends User{

	@Override
	public void recieveMessage(String message) {
		System.out.println("userul " + this.nume + "a primit mesajul (DESKTOP): " + message);
	}

}
