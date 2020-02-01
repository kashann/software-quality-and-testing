package broker;

import doubleCheckingLock.Produs;

public class Consumator implements Runnable {
	Broker broker;
	String nume;
	
	public Consumator(Broker broker, String nume) {
		super();
		this.broker = broker;
		this.nume = nume;
	}

	@Override
	public void run() {
		Produs p = broker.get();
		while(broker.check() || p != null) {
			System.out.println(nume + " a consumat " + p.toString());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			p = broker.get();
		}
	}
}
