package iteratorDesignPattern;

public class Client {
	int cod;
	String denumire;
	String localitate;
	
	public Client(int cod, String denumire, String localitate) {
		super();
		this.cod = cod;
		this.denumire = denumire;
		this.localitate = localitate;
	}

	@Override
	public String toString() {
		return "Client [cod=" + cod + ", denumire=" + denumire + ", localitate=" + localitate + "]";
	}
	
	
}
