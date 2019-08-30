package Strategy;

import java.util.ArrayList;

public class StrategyLowCalories implements IStrategy{
	@Override
	public MenuOffer selectMenu(ArrayList<MenuOffer> menuList) {
		MenuOffer bestMenu = menuList.get(0);
		
		for(MenuOffer m:menuList) {
			if(m.getNoCalories() < bestMenu.getNoCalories()) {
				bestMenu = m;
			}
		}
		
		return bestMenu;
	}
}
