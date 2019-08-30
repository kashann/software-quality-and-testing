package sem4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStudentMaxMark {

	@Test
	public void testRight() {
		int[] marks = {10, 6, 9, 8};
		Student s = new Student("Gigel", 20, marks, EFaculty.CSIE);
		int actualValue = s.maxMark();
		int expectedValue = 10;
		assertEquals("test normal set of marks", expectedValue, actualValue);
	}
	
	@Test
	public void testExistence() {
		//testing if the result is part of a set
		int[] marks = {10, 6, 9, 8};
		Student s = new Student("Gigel", 20, marks, EFaculty.CSIE);
		int actualValue = s.maxMark();
		boolean found = false;
		for(int i = 0; i < marks.length; i++)
			if(marks[i] == actualValue)
				found = true;
		assertTrue(found);
	}
	
	@Test
	public void testCrossCheck() {
		int[] marks = {10, 6, 9, 8};
		Student s = new Student("Gigel", 20, marks, EFaculty.CSIE);
		int actualValue = s.maxMark();
		int expectedValue = s.maxMark2();
		assertEquals("Test using different method", expectedValue, actualValue);
	}

}
