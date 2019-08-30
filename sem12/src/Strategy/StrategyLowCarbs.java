package Strategy;

import java.util.ArrayList;

public class StrategyLowCarbs implements IStrategy{
	@Override
	public MenuOffer selectMenu(ArrayList<MenuOffer> menuList) {
		MenuOffer bestMenu = menuList.get(0);
		
		for(MenuOffer m:menuList) {
			if(m.getNoCarbs() < bestMenu.getNoCarbs()) {
				bestMenu = m;
			}
		}
		
		return bestMenu;
	}
}
