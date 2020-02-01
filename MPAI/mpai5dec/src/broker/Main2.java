package broker;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main2 {	
	public static void main(String args[]) {
		Broker broker = new Broker();
		Producator prod = new Producator(broker, 5);
		Consumator cons1 = new Consumator(broker, "Ion");
		Consumator cons2 = new Consumator(broker, "Popescu");
		ExecutorService service = Executors.newFixedThreadPool(3);
		service.execute(cons1);
		service.execute(cons2);
		Future<?> future = service.submit(prod);
		try {
			future.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		service.shutdown();
	}	
}
