package sem2CTS;

import java.util.ArrayList;
import java.util.Arrays;

//	CREATE THE CLIENT CLASS AND COMBINE IT WITH THE SHOP CLASS IN ORDER FOR THE CLIENT TO BUY FROM THE SHOP//ASSIGNMENT ON ONLINE

public class Shop {
	private ArrayList<Product> productList;
	private int[] commercialExcessPercentage;
	private int[] productsStock;
	
	public Shop(ArrayList<Product> productList, int[] commercialExcessPercentage, int[] productsStock) {
		super();
		this.productList = productList;
		this.commercialExcessPercentage = commercialExcessPercentage;
		this.productsStock = productsStock;
	}
	
	@Override
	public String toString() {
		return "Shop [productList=" + productList + ", commercialExcessPercentage="
				+ Arrays.toString(commercialExcessPercentage) + ", productsStock=" + Arrays.toString(productsStock)
				+ "]";
	}
		
}
