package doubleCheckingLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BlocareDubla extends Colectie {
	protected Lock lock;

	public BlocareDubla(int dim) {
		super(dim);
		lock = new ReentrantLock();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addProduct(Produs p) {		
		if(produse.size() < dim) {
			lock.lock();
			if(produse.size() < dim) {
				try {
					produse.add(p);
					System.out.println(toString());
					return true;
				}
				finally {
					lock.unlock();
				}
			}			
		}
		return false;
	}
}
