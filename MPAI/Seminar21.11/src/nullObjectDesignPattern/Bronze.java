package nullObjectDesignPattern;

public class Bronze implements Discount {

	@Override
	public float getValue(float valoare) {
		return 0.05f*valoare;
	}

}
