package Creational.Factory;

public abstract class ADocument { //product interface
	private String titlu;
	
	public abstract String getTip();
	public abstract void print(String text);
	
	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
}
