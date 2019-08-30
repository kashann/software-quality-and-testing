package s08.g1077.nadeem.kashan.observer;

import java.util.ArrayList;

public abstract class ALevelUp {
	ArrayList<IObserver> observers = new ArrayList<IObserver>();
	
	public void attach(IObserver o) {
		if(observers != null)
			observers.add(o);
	}
	
	public void detach(IObserver o) {
		if(observers != null)
			observers.remove(o);
	}
	
	public void notifyAllObservers() {
		if(observers != null)
			for(int i = 0; i < observers.size(); i++)
				observers.get(i).levelUp();
	}
}
