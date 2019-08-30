package Strategy;

import java.util.ArrayList;

public interface IStrategy {
	MenuOffer selectMenu(ArrayList<MenuOffer> menuList);
}
