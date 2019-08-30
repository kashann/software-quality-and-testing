package Strategy;

public class TestStrategy {

	public static void main(String[] args) {
		MenuOffer menu1 = new MenuOffer("Menu1", 430, 15);
		MenuOffer menu2 = new MenuOffer("Menu2", 250, 60);
		MenuOffer menu3 = new MenuOffer("Menu3", 510, 66);
		MenuOffer menu4 = new MenuOffer("Menu4", 200, 20);
		
		RestaurantMenu restaurant = new RestaurantMenu();
		restaurant.addMenu(menu1);
		restaurant.addMenu(menu2);
		restaurant.addMenu(menu3);
		restaurant.addMenu(menu4);
		
		//set the strategy that you want
		restaurant.setStrategy(new StrategyLowCalories());
		System.out.println(restaurant.selectMenu());
		
		//set a different strategy
		restaurant.setStrategy(new StrategyLowCarbs());
		System.out.println(restaurant.selectMenu());
	}

}
