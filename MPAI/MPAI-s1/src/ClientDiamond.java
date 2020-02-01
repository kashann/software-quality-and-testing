
public class ClientDiamond extends Client2 {
	public ClientDiamond(int cod, String denumire, String adresa) {
		super(cod, denumire, adresa);
	}
	
	@Override
	public double getDiscount() {
		return 10;
	}
	
	@Override
	public void afiseaza() {
		System.out.println("Clientul (" + this.getCod() + ") " + this.getDenumire() + " are adresa " + this.getAdresa() + " (" + this.getDiscount() + "% discount).");
	}
}
