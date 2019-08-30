package Structurale.Facade;

public class Fereastra {
	protected boolean isClosed = true;
	
	public void inchide() {
		if(isClosed == false) {
			this.isClosed = true;
			System.out.println("Fereastra inchisa");
		}
		
	}
	
	public void deschide() {
		if(isClosed == true) {
			this.isClosed = false;
			System.out.println("Fereastra deschisa");
		}
	}
}
