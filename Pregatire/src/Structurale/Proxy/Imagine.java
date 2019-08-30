package Structurale.Proxy;

public class Imagine implements InterfataImagine{ //real subject

	private String fisier = null;
	
	@Override
	public void afisareImagine() {
		System.out.println("Se afiseaza: " + fisier);
	}

	public Imagine(final String fisier) {
		super();
		this.fisier = fisier;
		incarcaImagine();
	}
	
	public void incarcaImagine() {
		System.out.println(this.fisier + " Imaginea se inarca...");
	}
	

}
