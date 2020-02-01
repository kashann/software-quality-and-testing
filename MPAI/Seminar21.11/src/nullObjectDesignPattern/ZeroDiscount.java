package nullObjectDesignPattern;

public class ZeroDiscount implements Discount{

	@Override
	public float getValue(float valoare) {
		return valoare;
	}

}
