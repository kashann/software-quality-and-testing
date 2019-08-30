package testCases;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import testJUnit_BankAcc.BankAccount;
import testJUnit_BankAcc.ExceptionDeposit;

public class TestDeposits {

	@Test
	public void testRight() {
		BankAccount ba = new BankAccount(3800, 3000, 10);
		try {
			ba.deposit(300);
			double actualValue = ba.getBalance();
			double expectedValue = 4100;
			assertEquals("Test a normal deposit", expectedValue, actualValue, 0.01);
		} catch (ExceptionDeposit e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	@Category(BoundaryTest.class)
	@Test
	public void testLowBoundary() {
		BankAccount ba = new BankAccount(3800, 3000, 10);
		try {
			ba.deposit(1);
			double actualValue = ba.getBalance();
			double expectedValue = 3801;
			assertEquals("Test a minimum deposit", expectedValue, actualValue, 0.01);
		} catch (ExceptionDeposit e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	@Test
	public void testInverse() {
		BankAccount ba = new BankAccount(3800, 3000, 10);
		try {
			ba.deposit(300);
			double actualValue = 0;
			actualValue = ba.getBalance();
			assertNotEquals("Inverse testing a maximum deposit", 0, (int)actualValue);
		} catch (ExceptionDeposit e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}

	@Test
	public void testException0() {
		BankAccount ba = new BankAccount(3800, 3000, 10);
		try {
			ba.deposit(0);
			assertTrue("Didn't threw an exception where it should", false);
		} catch (ExceptionDeposit e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue("Exception testing a 0 deposit", true);
		}
	}
	
	@Test
	public void testException1() {
		BankAccount ba = new BankAccount(3800, 3000, 10);
		try {
			ba.deposit(-1);
			assertTrue("Didn't threw an exception where it should", false);
		} catch (ExceptionDeposit e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue("Exception testing a negative deposit", true);
		}
	}
	
	@Test
	public void testException2() {
		BankAccount ba = new BankAccount(3800, 3000, 10);
		try {
			ba.deposit(Double.MAX_VALUE);
			assertTrue("Didn't threw an exception where it should", false);
		} catch (ExceptionDeposit e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue("Exception testing a crazy high deposit", true);
		}
	}
	
	@Test
	public void testPerformance1() {
		BankAccount ba = new BankAccount(3800, 3000, 10);
		long startTime = System.currentTimeMillis();
		try {
			for(int i = 1; i <= 10000; i++)
				ba.deposit(200);
			long endTime = System.currentTimeMillis();
			long maxTime = 1;
			assertTrue(maxTime >= endTime - startTime);
		} catch (ExceptionDeposit e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	@Test(timeout = 1)
	public void testPerformance2() {
		BankAccount ba = new BankAccount(3800, 3000, 10);
		try {
			ba.deposit(200);
		} catch (ExceptionDeposit e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
}
