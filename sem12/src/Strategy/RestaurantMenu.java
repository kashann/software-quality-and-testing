package Strategy;

import java.util.ArrayList;

public class RestaurantMenu {
	private IStrategy strategy;
	private ArrayList<MenuOffer> menuList = new ArrayList<MenuOffer>();
	
	public void addMenu(MenuOffer menu) {
		menuList.add(menu);
	}
	
	//method for setting the strategy
	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	public MenuOffer selectMenu() {
		return strategy.selectMenu(menuList);
	}
}
