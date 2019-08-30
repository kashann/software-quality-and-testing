package testCases;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import testJUnit_BankAcc.BankAccount;
import testJUnit_BankAcc.ExceptionWithdrawal;

public class TestWithdrawals {

	@Test
	public void testRight() {
		BankAccount ba = new BankAccount(3800, 3000, 10);
		try {
			ba.withdraw(300);
			double actualValue = ba.getBalance();
			double expectedValue = 3500;
			assertEquals("Test a normal withdrawal", expectedValue, actualValue, 0.01);
		} catch (ExceptionWithdrawal e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	@Category(BoundaryTest.class)
	@Test
	public void testBoundaryLimit() {
		BankAccount ba = new BankAccount(3800, 3000, 10);
		try {
			ba.withdraw(3000);
			double actualValue = ba.getBalance();
			double expectedValue = 800;
			assertEquals("Test an overlimit withdrawal", expectedValue, actualValue, 0.01);
		} catch (ExceptionWithdrawal e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue("Withdrawal limit reached!", false);
		}
	}
	
	@Category(BoundaryTest.class)
	@Test
	public void testBoundaryBalance() {
		BankAccount ba = new BankAccount(3800, 3800, 10);
		try {
			ba.withdraw(3790);
			double actualValue = ba.getBalance();
			double expectedValue = 10;
			assertEquals("Test withdrawal to lowest balance", expectedValue, actualValue, 0.01);
		} catch (ExceptionWithdrawal e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue("Withdrawal limit reached!", false);
		}
	}
	
	@Category(BoundaryTest.class)
	@Test
	public void testBoundaryMinWithdrawal() {
		BankAccount ba = new BankAccount(3800, 3000, 10);
		try {
			ba.withdraw(10);
			double actualValue = ba.getBalance();
			double expectedValue = 3790;
			assertEquals("Test minimum withdrawal", expectedValue, actualValue, 0.01);
		} catch (ExceptionWithdrawal e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue("Withdrawal too small!", false);
		}
	}
	
	@Test
	public void testInverse() {
		BankAccount ba = new BankAccount(3800, 3000, 10);
		try {
			ba.withdraw(800);
			assertNotEquals("Inverse testing a withdrawal", 3800, ba.getBalance());
		} catch (ExceptionWithdrawal e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	@Test
	public void testException() {
		BankAccount ba = new BankAccount(3800, 3800, 10);
		try {
			ba.withdraw(3800);
			assertTrue("Didn't threw an exception where it should", false);
		} catch (ExceptionWithdrawal e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue("Exception testing a max withdrawal", true);
		}
	}
	
	@Test
	public void testPerformance1() {
		BankAccount ba = new BankAccount(3800, 3000, 10);
		long startTime = System.currentTimeMillis();
		try {
			for(int i = 1; i <= 100; i++)
				ba.withdraw(18);
			long endTime = System.currentTimeMillis();
			long maxTime = 1;
			assertTrue(maxTime >= endTime - startTime);
		} catch (ExceptionWithdrawal e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	@Test(timeout = 1)
	public void testPerformance2() {
		BankAccount ba = new BankAccount(3800, 3000, 10);
		try {
			ba.withdraw(1800);
		} catch (ExceptionWithdrawal e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
}
