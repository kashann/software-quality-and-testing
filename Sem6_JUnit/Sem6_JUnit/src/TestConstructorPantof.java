import static org.junit.Assert.*;

import org.junit.Test;

public class TestConstructorPantof {

	@Test
	public void testRight() {
		try {
			Pantof pantof = new Pantof("Adidas Jeremy Smith", 10, ECuloare.ALB, 399);
			//testing the setters of the object
			assertEquals("Adidas Jeremy Smith", pantof.getDenProdus());
			assertEquals(10, pantof.getCantitate());
			assertEquals(ECuloare.ALB, pantof.getCuloare());
			assertEquals(399, pantof.getPret(),0.01);
		} catch (ExceptionConstructor e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	@Test
	public void testException() {
		try {
			Pantof pantof = new Pantof("Nike", 10, ECuloare.ALB, 399); //short name
			//it is not okay to be here
			assertTrue(false);
		} catch (ExceptionConstructor e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(true);
		}
	}
	
	@Test
	public void testExistence() {
		try {
			Pantof pantof = new Pantof("Air Jordan", 10, ECuloare.ALB, 399);
			//1 testing if the object was created
			assertNotNull(pantof);
		} catch (ExceptionConstructor e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//2
			assertTrue(false);
		}
	}
	
	@Test(timeout = 5)
	public void testPerformance() throws ExceptionConstructor{
		Pantof pantof = new Pantof("Huarache", 10, ECuloare.ALB, 399);
	}

	@Test
	public void testBoundaryLowLimit() {
		//for the quantity
		//testing similar to the right but with extreme values
		try {
			Pantof pantof = new Pantof("Nikey", 1, ECuloare.ALB, 399);
			assertEquals("Nikey", pantof.getDenProdus());
			assertEquals(1, pantof.getCantitate());
			assertEquals(ECuloare.ALB, pantof.getCuloare());
			assertEquals(399, pantof.getPret(),0.01);
		} catch (ExceptionConstructor e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
}
