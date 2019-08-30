package Behavioral.Observer;

public class TestObserver {
	public static void main(String[] args) {
		Button btn = new Button();
		IObserver db = new ObserverDatabse();
		IObserver login = new ObserverLogin();
		btn.attach(db);
		btn.attach(login);
		btn.click();
		btn.click();
	}
}
