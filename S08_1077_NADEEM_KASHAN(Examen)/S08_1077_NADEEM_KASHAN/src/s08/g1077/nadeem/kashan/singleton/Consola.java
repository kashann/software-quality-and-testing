package s08.g1077.nadeem.kashan.singleton;

import s08.g1077.nadeem.kashan.observer.IObserver;

public class Consola implements IObserver{
	private static Consola instance = null;
	
	private Consola() throws Exception {
		if(instance != null)
			throw new Exception("Console already exists!");
	}

	public static Consola getInstance() throws Exception {
		if(instance == null)
			instance = new Consola();
		return instance;
	}

	@Override
	public void levelUp() {
		// TODO Auto-generated method stub
		System.out.println("level up");
	}
}
