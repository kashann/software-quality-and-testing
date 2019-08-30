package testSuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import testCases.TestDeposits;
import testCases.TestWithdrawals;

@RunWith(Suite.class)
@SuiteClasses({ TestDeposits.class, TestWithdrawals.class })
public class AllTests {

}
