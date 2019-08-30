package sem4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStudentConstructor {

	@Test
	public void testRight() {
		int[] marks = {10, 6, 9, 8};
		Student s = new Student("Gigel", 20, marks, EFaculty.CSIE);
		assertEquals("Testing set of name", "Gigel", s.getName());
		//using assertEquals for all the fields
		assertEquals("Testing set of age", 20, s.getAge());
	}

	@Test
	public void testExistence() {
		int[] marks = {10, 6, 9, 8};
		Student s = new Student("Gigel", 20, marks, EFaculty.CSIE);
		assertNotNull("test if the obj was created");
	}
}
