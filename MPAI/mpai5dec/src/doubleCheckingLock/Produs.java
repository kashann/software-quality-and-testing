package doubleCheckingLock;

public class Produs {
	private int cod;
	private String denumire;
	private float pret;
	private String um;
	
	public Produs() {
		super();
	}
	
	public Produs(int cod, String denumire, float pret, String um) {
		super();
		this.cod = cod;
		this.denumire = denumire;
		this.pret = pret;
		this.um = um;
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
	
	public float getPret() {
		return pret;
	}
	
	public void setPret(float pret) {
		this.pret = pret;
	}
	
	public String getUm() {
		return um;
	}
	
	public void setUm(String um) {
		this.um = um;
	}

	@Override
	public String toString() {
		return "Produs [cod=" + cod + ", denumire=" + denumire + ", pret=" + pret + ", um=" + um + "]";
	}
}
