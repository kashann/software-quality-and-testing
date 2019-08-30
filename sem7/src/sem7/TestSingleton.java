package sem7;

public class TestSingleton {
	public static void main(String[] args) throws Exception {
		RestaurantSingleton restaurant1 = RestaurantSingleton.getInstance();
		RestaurantSingleton restaurant2 = RestaurantSingleton.getInstance();
		
		if(restaurant1 == restaurant2)
			System.out.println("The same references");
		else
			System.out.println("Different objects");
	}
}
