package iteratorDesignPattern;

public class IteratorClienti implements Iterator<Client> {
	private Client[] clienti;
	int pos;
	
	public IteratorClienti(Client[] clienti) {
		super();
		this.clienti = clienti;
		this.pos = 0;
	}

	@Override
	public Client next() {
		// TODO Auto-generated method stub
		return this.clienti[pos++];
	}

	@Override
	public Client prev() {
		// TODO Auto-generated method stub
		return this.clienti[--pos];
	}

	@Override
	public boolean hasNext() {
		return pos < clienti.length;
	}

	@Override
	public boolean hasPrev() {
		// TODO Auto-generated method stub
		return pos > 0;
	}

}
