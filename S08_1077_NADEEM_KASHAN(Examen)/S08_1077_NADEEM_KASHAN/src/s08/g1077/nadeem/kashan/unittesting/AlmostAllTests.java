package s08.g1077.nadeem.kashan.unittesting;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@ExcludeCategory(ExcludedFromTesting.class)
@SuiteClasses({ TestConstructor.class, TestSetLatura.class }) //TestSetMaterial.class can be added
public class AlmostAllTests {

}
