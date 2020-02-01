package nullObjectDesignPattern;

public class Gold implements Discount{

	@Override
	public float getValue(float valoare) {
		return 0.2f*valoare;
	}

}
