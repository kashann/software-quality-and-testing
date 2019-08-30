package Creational.Singleton;

public class TestSingleton {

	public static void main(String[] args) throws Exception {
		RestaurantSingleton r1 = RestaurantSingleton.getInstance();
		RestaurantSingleton r2 = RestaurantSingleton.getInstance();
		
		if(r1 == r2)
			System.out.println("The same references");
		else
			System.out.println("Different objects");

	}

}
