package S8.G1077.Nadeem.Kashan.testUnits;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import S8.G1077.Nadeem.Kashan.classes.DontRun;

@RunWith(Categories.class)
@ExcludeCategory(DontRun.class)
@SuiteClasses({ TestGetIngredientWithMaxQuantity.class, TestIngredientConstructor.class })
public class AllTestsExceptDontRun {

}
