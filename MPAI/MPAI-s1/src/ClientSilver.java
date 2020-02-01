
public class ClientSilver extends Client2 {
	public ClientSilver(int cod, String denumire, String adresa) {
		super(cod, denumire, adresa);
	}
	
	@Override
	public double getDiscount() {
		return 5;
	}
	
	@Override
	public void afiseaza() {
		System.out.println("Clientul (" + this.getCod() + ") " + this.getDenumire() + " are adresa " + this.getAdresa() + " (" + this.getDiscount() + "% discount).");
	}
}
