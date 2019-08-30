package sem2CTS;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FilesManager {
	private String inputFileNameProduct;
	
	public FilesManager(String inputFileNameProduct) {
		super();
		this.inputFileNameProduct = inputFileNameProduct;
	}

	public ArrayList<Product> readProductsFromFile(){
		ArrayList<Product> productList = new ArrayList<>();
		
		BufferedReader br = null;
		FileReader fr = null;
		try {
			fr = new FileReader(inputFileNameProduct);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		br = new BufferedReader(fr);
		String line;
		try {
			while((line = br.readLine()) != null) {
				String[] comp = line.split(",");
				Product product = new Product();
				product.setName(comp[0]);
				product.setPrice(Integer.parseInt(comp[1]));
				product.setProductType(EProductType.valueOf(comp[2]));
				productList.add(product);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return productList;
	}
}
