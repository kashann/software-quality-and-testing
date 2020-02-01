package broker;

import java.util.Random;

import doubleCheckingLock.Produs;

public class Producator implements Runnable {
	Broker broker;
	int inventory;
	
	public Producator(Broker broker, int inventory) {
		super();
		this.broker = broker;
		this.inventory = inventory;
	}
	


	@Override
	public void run() {
		broker.setCheck(true);
		for(int i = 0; i < inventory; i++) {
			Produs p = new Produs(i, "Denumire_" + i, i, "BUC" );
			broker.add(p);
			System.out.println("S-a produs: " + p.toString());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		broker.setCheck(false);
	}
}
