
public abstract class Client2 {
	private int cod;
	private String denumire;
	private String adresa;
	
	public Client2() {
		
	}
	
	public Client2(int cod, String denumire, String adresa) {
		this.cod = cod;
		this.denumire = denumire;
		this.adresa = adresa;
	}
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getDenumire() {
		return denumire;
	}
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	
	public void afiseaza() {
		System.out.println("Clientul (" + this.cod + ") " + this.denumire + " are adresa " + this.adresa + ".");
	}
	
	public abstract double getDiscount();
}
