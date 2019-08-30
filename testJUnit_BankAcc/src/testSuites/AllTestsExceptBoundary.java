package testSuites;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import testCases.BoundaryTest;
import testCases.TestDeposits;
import testCases.TestWithdrawals;

@RunWith(Categories.class)
@ExcludeCategory(BoundaryTest.class)
@SuiteClasses({ TestDeposits.class, TestWithdrawals.class })
public class AllTestsExceptBoundary {

}
