package Structurale.Facade;

public class ApartamentFacade {
	Fereastra fereastra;
	MasinaSpalat masina;
	
	public ApartamentFacade(Fereastra f, MasinaSpalat m) {
		this.fereastra = f;
		this.masina = m;
	}
	
	public void inchideCasa() {
		System.out.println("\nCasa se inchide!");
		this.fereastra.inchide();
		this.masina.opreste();
	}
	
	public void pornesteCasa() {
		System.out.println("\nCasa se deschide!");
		this.fereastra.deschide();
		this.masina.porneste();
	}
}
