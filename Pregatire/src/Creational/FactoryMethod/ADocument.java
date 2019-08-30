package Creational.FactoryMethod;

public abstract class ADocument {
	private String titlu;
	
	public abstract String getTip();
	public abstract void print(String text);
	
	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
}
