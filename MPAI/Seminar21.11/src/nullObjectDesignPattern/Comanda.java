package nullObjectDesignPattern;

public class Comanda {
	Discount discount;
	String produse;
	int total;
	
	public Comanda(Discount discount, String produse, int total) {
		super();
		this.discount = discount;
		this.produse = produse;
		this.total = total;
	}

	public float calculeazaDiscount() {
		return discount.getValue(total);
	}
}
