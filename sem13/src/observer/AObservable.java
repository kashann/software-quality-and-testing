package observer;

import java.util.ArrayList;

public abstract class AObservable {
	private ArrayList<IObserver> observerList = new ArrayList<>();
	
	public void addObserver(IObserver obs) {
		this.observerList.add(obs);
	}
	
	public void removeObserver(IObserver obs) {
		this.observerList.remove(obs);
	}
	
	public void notifyAllObservers() {
		for(IObserver obs : observerList)
			obs.process();
	}
}
