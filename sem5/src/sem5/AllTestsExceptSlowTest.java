package sem5;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({ TestStudentConstructor.class, TestStudentMaxMark.class, TestStudentSetAge.class,
		TestStudentSetFaculty.class })
public class AllTestsExceptSlowTest {

}
