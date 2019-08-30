package Behavioral.Observer;

public class Button extends AClickable{ //concrete subject
	private boolean isClicked = false;
	
	public void setClicked() {
		if(!isClicked) {
			isClicked = true;
			this.notifyAllObservers();
		}
	}
	
	public void click() {
		System.out.println("Button pressed...");
		setClicked();
	}
}
