package monitor;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Main {	
	public static int incidente = 0;
	public static int persoane = 20;
	//public static CabinaDeProba cp = new CabinaProbaSimpla();
	public static CabinaDeProba cp = new CabinaProbaMonitorizata();
	public static CyclicBarrier cb = new CyclicBarrier(persoane + 1);
	public static void main(String[] args) throws InterruptedException {
		for(int i = 0; i < persoane; i++) {
			Client client = new Client(i);
			client.start();
		}
		try {
			cb.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(2000);
		System.out.println("Incidente=" + incidente);
	}
	
	static class Client extends Thread {
		public int id;
		public Client(int id) {
			this.id = id;
		}
		public void run() {
			try {
				cb.await();
				if(cp.intra(id)) {
					sleep((long) (Math.random()*100));
					cp.iese();
				}				
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			} catch (RuntimeException re) {
				incidente++;
			}
		}
	}
}
