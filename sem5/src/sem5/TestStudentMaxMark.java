package sem5;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

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
	
	@Category(SlowTest.class)
	@Test
	public void testCrossCheck() {
		int[] marks = {10, 6, 9, 8};
		Student s = new Student("Gigel", 20, marks, EFaculty.CSIE);
		int actualValue = s.maxMark();
		int expectedValue = s.maxMark2();
		assertEquals("Test using different method", expectedValue, actualValue);
	}
	
	@Test
	public void testInverse1() {
		int[] marks= {10, 6, 9, 8};
		Student s = new Student("Gigel", 20, marks, EFaculty.CSIE);
		int actualValue = s.maxMark();
		for(int i = 1; i < marks.length; i++) {
			if(marks[i] == actualValue)
				i++;
			assertNotEquals(i, actualValue);
		}
	}
	
	@Test
	public void testInverse2() {
		int[] marks= {10, 6, 9, 8};
		Student s = new Student("Gigel", 20, marks, EFaculty.CSIE);
		int actualValue = s.maxMark();
		for(int i = 1; i < 10; i++) {
			if(i == actualValue)
				i++;
			assertNotEquals(i, actualValue);
		}
	}
	
	@Test
	public void testInverse3() {
		int[] marks= {10, 6, 9, 8};
		Student s = new Student("Gigel", 20, marks, EFaculty.CSIE);
		int actualValue = 0;
		actualValue = s.maxMark();
		assertNotEquals(0, actualValue);
	}
	
	@Test
	public void testPerformance1() {
		int[] marks= {10, 6, 9, 8};
		Student s = new Student("Gigel", 20, marks, EFaculty.CSIE);
		long startTime = System.currentTimeMillis();
		
		for(int i = 1; i <= 10000; i++)
			s.maxMark();
		
		long endTime = System.currentTimeMillis();
		long maxTime = 1;
		assertTrue(maxTime >= endTime - startTime);
	}
	
	@Test(timeout = 1)
	public void testPerformance2() {
		int[] marks= {10, 6, 9, 8};
		Student s = new Student("Gigel", 20, marks, EFaculty.CSIE);
		s.maxMark();
	}
}
