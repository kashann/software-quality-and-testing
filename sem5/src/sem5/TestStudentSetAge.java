package sem5;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestStudentSetAge {

	@Test
	public void testRight() {
		//similar to testing the constructor
		//testing under normal conditions
		// 21 is between 18 and 65
		int[] marks = {10, 6, 9, 8};
		Student s = new Student("Gigel", 20, marks, EFaculty.CSIE);
		try {
			s.setAge(21);
			//IT IS GOOD
			assertEquals("compare age", 21, s.getAge());
		} catch (ExceptionInputAge e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//IT IS NOT GOOD
			assertTrue("for age under limits, the setter threw an exception", false);
		}
	}
	
	@Test
	public void testException() {
		//we test using a value that will generate an exception
		int[] marks = {10, 6, 9, 8};
		Student s = new Student("Gigel", 20, marks, EFaculty.CSIE);
		try {
			s.setAge(16);
			//IT IS NOT GOOD
			assertTrue("didn't throw an exception when it should", false);
		} catch (ExceptionInputAge e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//IT IS GOOD
			assertTrue(true);
		}
	}

	@Test
	public void testBoundaryLowestValue() {
		//testing for the age of 18
		int[] marks = {10, 6, 9, 8};
		Student s = new Student("Gigel", 20, marks, EFaculty.CSIE);
		try {
			s.setAge(18);
			//IT IS NOT GOOD
			assertEquals("compare age", 18, s.getAge());
		} catch (ExceptionInputAge e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//IT IS GOOD
			assertTrue("for age under limits, the method threw an exception", false);
			//or use fail
		}
	}
	
	@Test
	public void testInverseRelationship() {
		int[] marks= {10, 6, 9, 8};
		Student s = new Student("Gigel", 20, marks, EFaculty.CSIE);
		try {
			s.setAge(18);
			assertNotEquals("Test inverse set age", 20, s.getAge());
			
		}catch(ExceptionInputAge e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	@Category(SlowTest.class)
	@Test
	public void testInverseRelationship2() {
		int[] marks= {10, 6, 9, 8};
		Student s = new Student("Gigel", 20, marks, EFaculty.CSIE);
		try {
			s.setAge(25);
			//compare if the age is not 25 
			int actualValue=25;
			for(int i = 18; i <= 65; i++) {
				if(i == actualValue)
					i++;
				assertNotEquals("Test inverse relationship", i, s.getAge());
			}
		}catch(ExceptionInputAge e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}
}

