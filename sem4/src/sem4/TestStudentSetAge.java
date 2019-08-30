package sem4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStudentSetAge {

	@Test
	public void testRight() {
		//similar to testing the constructor
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
}
