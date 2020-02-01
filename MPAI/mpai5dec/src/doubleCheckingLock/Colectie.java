package doubleCheckingLock;

import java.util.ArrayList;
import java.util.List;

public abstract class Colectie {
	protected List<Produs> produse;
	int dim;
	
	public Colectie(int dim) {
		super();
		produse = new ArrayList<Produs>(dim);
		this.dim = dim;
	}
	
	public abstract boolean addProduct(Produs p);

	@Override
	public String toString() {
		return "Colectie [size=" + produse.size() + ", maxDim=" + dim + "]";
	}
	
}
