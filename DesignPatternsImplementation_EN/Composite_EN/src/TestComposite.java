
public class TestComposite {

	public static void main(String[] args) {
		//level 0
		ANode menu = new Structure("Menu");
		
		//level 1
		ANode structureFood = new Structure("food");
		menu.addNode(structureFood);
		ANode structureDrinks = new Structure("drinks");
		menu.addNode(structureDrinks);
		
		//level 2 for food
		ANode structurePizza = new Structure("pizza");
		structureFood.addNode(structurePizza);
		structureFood.addNode(new Product("soup of the day", 23));
		
		//level 2 for drinks
		ANode structureSoftDrinks = new Structure("soft drinks");
		structureDrinks.addNode(structureSoftDrinks);
		structureDrinks.addNode(new Product("coffee",14));
		
		//level 3 for pizza
		structurePizza.addNode(new Product("pizza romana",26));
		structurePizza.addNode(new Product("pizza italiana",29));
		
		//level 3 for soft drinks
		structureSoftDrinks.addNode(new Product("cola",12));
		structureSoftDrinks.addNode(new Product("pepsi",11));
		
		System.out.println(menu.getInfo());
	}

}
