package iteratorDesignPattern;

public class ListaClienti {
	Client[] clienti;
	
	public ListaClienti(Client[] clienti) {
		super();
		this.clienti = clienti;
	}

	public Iterator<Client> getIterator(){
		return new IteratorClienti(clienti);
	}
}
