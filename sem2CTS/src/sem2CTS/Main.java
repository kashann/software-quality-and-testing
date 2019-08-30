package sem2CTS;

import java.util.ArrayList;

public class Main {
	public static void main(String [] args) {
		Product product1 = new Product("Water AQUA", 6, EProductType.food);
		Product product2 = new Product("Bread", 3, EProductType.food);
		Product product3 = new Product("Room freshener", 6, EProductType.cleaning);
		Product product4 = new Product("TV Samsung", 6, EProductType.electronics);
		
		ArrayList<Product> productList = new ArrayList<>();
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		productList.add(product4);
		
		FilesManager fileManager = new FilesManager("products.txt");
		ArrayList<Product> productsListFile = new ArrayList<>();
		productsListFile = fileManager.readProductsFromFile();
		
		for(Product p:productsListFile) {
			System.out.println(p + "\n");
		}
		
	}
}
