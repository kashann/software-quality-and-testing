package s08.g1077.nadeem.kashan.main;

import s08.g1077.nadeem.kashan.singleton.Consola;

public class ProgMainSingleton {
	public static void main(String[] args) {
		try {
			Consola c1 = Consola.getInstance();
			Consola c2 = Consola.getInstance();
			if(c1==c2) {
				System.out.println("Singleton");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
