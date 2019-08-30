package sem3CTS;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPosMinValue {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Setup before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Tear Down after class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Setup");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Tear down");
	}

	@Test
	public void testRight1() {
		//fail("Not yet implemented");
		//assertTrue(true);
		//assertFalse("Comparing true to false", false);
		//assertFalse(false);
				
		//int x = 2, y = 4;
		//assertEquals("Comparing x to y", x, y);
		//assertNotEquals();
		
		//System.out.println("test1");
		
		int[] v = {10, 5, -2, 100, -10};
		Utils u = new Utils();
		int expectedValue = 5;
		int actualValue = u.posMinValue(v);
		assertEquals("Testing pos val for array containing pos and neg", expectedValue, actualValue);
	}

	@Test
	public void testRight2() {
		int[] v = {10, 5, 2, 100, 10};
		Utils u = new Utils();
		int expectedValue = 2;
		int actualValue = u.posMinValue(v);
		assertEquals("Testing for only pos", expectedValue, actualValue);
	}
	
	@Test
	public void testRight3() {
		int[] v = {-10, -5, -2, -100, -10};
		Utils u = new Utils();
		int expectedValue = -1;
		int actualValue = u.posMinValue(v);
		assertEquals("Testing for only neg", expectedValue, actualValue);
	}
	
	@Test
	public void testRight4() {
		int[] v = {-10, -5, -2, -100, 0};
		Utils u = new Utils();
		int expectedValue = 0;
		int actualValue = u.posMinValue(v);
		assertEquals("Testing for 0 val", expectedValue, actualValue);
	}
}
