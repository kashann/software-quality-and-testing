package monitor;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CabinaProbaMonitorizata extends CabinaDeProba {
	protected Lock monitor;
	protected Condition cond;
	
	public CabinaProbaMonitorizata() {
		super();
		monitor = new ReentrantLock();
		cond = monitor.newCondition();
	}

	@Override
	public boolean intra(int client) {
		monitor.lock();
		try {
			while(contor > 0) {
				cond.awaitUninterruptibly();
				System.out.println("whileIN " + client);
			}
			if(++contor == 1) {
				System.out.println("IN " + client);
				cond.signal();
			}	
			return esteOcupata();
		}
		finally {
			monitor.unlock();
		}
	}

	@Override
	public void iese() {
		monitor.lock();
		try {
			while(contor <= 0) {
				cond.awaitUninterruptibly();
				System.out.println("whileOUT");
			}
			if(--contor == 0) {
				System.out.println("OUT");
				cond.signal();
			}
		}
		finally {
			monitor.unlock();
		}
	}

}
