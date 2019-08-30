package s08.g1077.nadeem.kashan.observer;

public class User extends ALevelUp{
	private int itemsBuilt;
	
	public User() {
		itemsBuilt = 0;
	}
	
	public void buildItem() {
		itemsBuilt++;
		if(itemsBuilt % 5 == 0)
			notifyAllObservers();
	}
}
