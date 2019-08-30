package s08.g1077.nadeem.kashan.main;

import s08.g1077.nadeem.kashan.observer.User;
import s08.g1077.nadeem.kashan.singleton.Consola;

public class ProgMainObserver {

	public static void main(String[] args) throws Exception {
		Consola c1 = Consola.getInstance();
		User u = new User();
		u.attach(c1);
		for(int i = 0; i < 14; i++) { //should level up 2 times
			u.buildItem();
		}
	}

}
