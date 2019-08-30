package Creational.Singleton;

import java.util.ArrayList;

public class RestaurantSingleton {
	private static RestaurantSingleton instance = null;
	//the resources
	private int noTables;
	private ArrayList<Boolean> tables;
	
	private RestaurantSingleton() throws Exception {
		if(instance != null)
			throw new Exception("Object already created");
	}
	
	public static RestaurantSingleton getInstance() throws Exception {
		if(instance == null)
			instance = new RestaurantSingleton();
		return instance;
	}
}
