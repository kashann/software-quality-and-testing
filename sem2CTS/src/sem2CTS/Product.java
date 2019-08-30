package sem2CTS;

public class Product {
	private String name;
	private int price;
	private EProductType productType;
		
	public Product() {
		super();
	}
	public Product(String name, int price, EProductType productType) {
		super();
		this.name = name;
		this.price = price;
		this.productType = productType;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public EProductType getProductType() {
		return productType;
	}
	public void setProductType(EProductType productType) {
		this.productType = productType;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", productType=" + productType + "]";
	}
	
}
