package Behavioral.ChainOfResponsability;

public class Mesaj { //client
	private int proritate;
	private String text;

	public Mesaj(int proritate, String text) {
		super();
		this.proritate = proritate;
		this.text = text;
	}
	
	public int getProritate() {
		return proritate;
	}
	
	public String getText() {
		return text;
	}	
}
