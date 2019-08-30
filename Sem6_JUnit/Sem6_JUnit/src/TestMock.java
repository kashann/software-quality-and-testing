import static org.junit.Assert.*;

import org.junit.Test;

public class TestMock {

	@Test
	public void testRight1() {
		ProductMock product = new ProductMock();
		product.setOnSale(true);
		product.setPrice(200);
		float expectedValue = 150;
		float actualValue = CTSMath.getPretProdus(product);
		assertEquals("testing on sale price > 100", expectedValue, actualValue, 0.01);
	}
	
	@Test
	public void testRight2() {
		ProductMock product = new ProductMock();
		product.setOnSale(true);
		product.setPrice(80);
		float expectedValue = 64;
		float actualValue = CTSMath.getPretProdus(product);
		assertEquals("testing on sale price <= 100", expectedValue, actualValue, 0.01);
	}

	@Test
	public void testRight3() {
		ProductMock product = new ProductMock();
		product.setOnSale(false);
		product.setPrice(80);
		float expectedValue = 80;
		float actualValue = CTSMath.getPretProdus(product);
		assertEquals("testing not on sale", expectedValue, actualValue, 0.01);
	}
}
