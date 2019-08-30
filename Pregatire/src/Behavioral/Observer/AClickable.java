package Behavioral.Observer;

import java.util.ArrayList;

public abstract class AClickable { //subject interface
	ArrayList<IObserver> observers = new ArrayList<IObserver>();
	
	public void attach(IObserver handler) {
		if(observers != null)
			observers.add(handler);
	}
	
	public void detach(IObserver handler) {
		if(observers != null)
			observers.remove(handler);
	}
	
	public void notifyAllObservers() {
		if(observers != null)
			for(int i = 0; i < observers.size(); i++)
				observers.get(i).doClick();
	}
}
