package broker;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

import doubleCheckingLock.Produs;

public class Broker {
	ArrayBlockingQueue<Produs> queue;
	boolean check;

	public Broker() {
		super();
		queue = new ArrayBlockingQueue<Produs>(10);
	}
	
	public boolean add(Produs p) {
		return queue.offer(p);
	}
	
	public Produs get(){
		//return queue.poll();
		try {
			return queue.poll(1, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void setCheck(boolean b) {
		check = b;
	}
	
	public boolean check() {
		return check;
	}
}
