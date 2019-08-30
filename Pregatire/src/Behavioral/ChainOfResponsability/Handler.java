package Behavioral.ChainOfResponsability;

public abstract class Handler {
	protected Handler successor = null;
	
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	public abstract void manageRequest(Mesaj mesaj);
}
