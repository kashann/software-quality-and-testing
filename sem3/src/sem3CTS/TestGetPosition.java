package sem3CTS;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestGetPosition {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRight1() {
		Utils u = new Utils();
		int[] p = {10, 5, 15, 15, 25, 10};
		int expectedValue = 3;
		int actualValue = u.getPosition(p, 10);
		assertEquals("Test pos for intermediate val", expectedValue, actualValue);
	}

	@Test
	public void testRight2() {
		Utils u = new Utils();
		int[] p = {10, 5, 15, 15, 25, 10};
		int expectedValue = 1;
		int actualValue = u.getPosition(p, 25);
		assertEquals("Test pos for max val", expectedValue, actualValue);
	}
	
	@Test
	public void testRight3() {
		Utils u = new Utils();
		int[] p = {10, 5, 15, 15, 25, 10};
		int expectedValue = 4;
		int actualValue = u.getPosition(p, 5);
		assertEquals("Test pos for min val", expectedValue, actualValue);
	}
	
	@Test
	public void testRight4() {
		Utils u = new Utils();
		int[] p = {10, 5, 15, 15, 25, 10};
		int expectedValue = -1;
		int actualValue = u.getPosition(p, 13);
		assertEquals("Test pos for intermediate val not in array", expectedValue, actualValue);
	}
	
	@Test
	public void testRight5() {
		Utils u = new Utils();
		int[] p = {10, 5, 15, 15, 25, 10};
		int expectedValue = -1;
		int actualValue = u.getPosition(p, 2);
		assertEquals("Test pos for lower val not in array", expectedValue, actualValue);
	}
	
	@Test
	public void testRight6() {
		Utils u = new Utils();
		int[] p = {10, 5, 15, 15, 25, 10};
		int expectedValue = -1;
		int actualValue = u.getPosition(p, 30);
		assertEquals("Test pos for higher val not in array", expectedValue, actualValue);
	}
}
