public class ProductMock implements IProdus {
	
	//add fields
	boolean onSale;
	float price;
	
	//add setters
	
	
	@Override
	public boolean isOnSale() {
		// TODO Auto-generated method stub
		return onSale;
	}

	public void setOnSale(boolean onSale) {
		this.onSale = onSale;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

}
