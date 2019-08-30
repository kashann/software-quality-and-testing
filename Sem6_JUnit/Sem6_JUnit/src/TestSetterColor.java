import static org.junit.Assert.*;

import org.junit.Test;

public class TestSetterColor {

	@Test
	public void testInverseRelationship() {
		try {
			Pantof pantof = new Pantof("Nikey", 1, ECuloare.ALB, 399);
			pantof.setCuloare(ECuloare.NEGRU);
			//compare not to be to what it was
			assertNotEquals(ECuloare.ALB, pantof.getCuloare());
		} catch (ExceptionConstructor e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testRight() {
		try {
			Pantof pantof = new Pantof("Nikey", 1, ECuloare.ALB, 399);
			pantof.setCuloare(ECuloare.NEGRU);
			assertEquals(ECuloare.NEGRU, pantof.getCuloare());
		} catch (ExceptionConstructor e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
