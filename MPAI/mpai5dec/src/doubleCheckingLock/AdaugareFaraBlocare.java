package doubleCheckingLock;

public class AdaugareFaraBlocare extends Colectie {

	public AdaugareFaraBlocare(int dim) {
		super(dim);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addProduct(Produs p) {
		if(produse.size() < dim) {
			produse.add(p);
			System.out.println(toString());
			return true;
		}
		return false;
	}
	
}
