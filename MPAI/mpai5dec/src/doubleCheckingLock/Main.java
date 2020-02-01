package doubleCheckingLock;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		Produs p1 = new Produs(0, "Paine", 1, "BUC");
		Produs p2 = new Produs(1, "Apa", 2, "Sticla");
		Produs p3 = new Produs(2, "Lapte", 3, "L");
		Produs p4 = new Produs(3, "Miere", 10, "BUC");
		Produs p5 = new Produs(4, "Suc", 5, "BUC");
		Produs p6 = new Produs(5, "Carne", 3, "KG");
		ArrayList<Produs> cos = new ArrayList<Produs>(6);
		cos.add(p1);
		cos.add(p2);
		cos.add(p3);
		cos.add(p4);
		cos.add(p5);
		cos.add(p6);
		
		//Colectie colectie = new AdaugareFaraBlocare(100);
		//Colectie colectie = new BlocareSimpla(100);
		Colectie colectie = new BlocareDubla(100);
		
		for(int i = 0; i < 3; i++) {
			ExecutorService service = Executors.newFixedThreadPool(3);
			service.execute(new Runnable() {
				@Override
				public void run() {
					Random rand = new Random();
					//while(colectie.addProduct(p1)) {
					while(colectie.addProduct(cos.get(rand.nextInt(cos.size())))) {
						
					}
				}				
			});
			service.shutdown();
		}		
	}
}
