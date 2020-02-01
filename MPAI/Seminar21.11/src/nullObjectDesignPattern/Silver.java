package nullObjectDesignPattern;

public class Silver implements Discount {

	@Override
	public float getValue(float valoare) {
		return 0.1f*valoare;
	}



}
