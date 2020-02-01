
public class ClientGold extends Client2 {
	public ClientGold(int cod, String denumire, String adresa) {
		super(cod, denumire, adresa);
	}
	
	@Override
	public double getDiscount() {
		return 7;
	}
	
	@Override
	public void afiseaza() {
		System.out.println("Clientul (" + this.getCod() + ") " + this.getDenumire() + " are adresa " + this.getAdresa() + " (" + this.getDiscount() + "% discount).");
	}
}
