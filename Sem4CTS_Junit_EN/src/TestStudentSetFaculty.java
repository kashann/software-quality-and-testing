import static org.junit.Assert.*;

import org.junit.Test;

public class TestStudentSetFaculty {

	@Test
	public void testRight() {
		int[] marks= {10,6,9,8};
		Student s = new Student("Gigel", 20, marks , EFaculty.CSIE);
		s.setFaculty(EFaculty.MK);
		assertEquals("testing set of MK", EFaculty.MK, s.getFaculty());
	}
	
	@Test
	public void testInverseRelationship() {
		int[] marks= {10,6,9,8};
		Student s = new Student("Gigel", 20, marks , EFaculty.FABBV);
		s.setFaculty(EFaculty.MK);
		assertNotEquals("testing reverse relationship", EFaculty.CSIE, s.getFaculty());
	}
	
	@Test
	public void testInverseRelationship2() {
		int[] marks= {10,6,9,8};
		Student s = new Student("Gigel", 20, marks , EFaculty.FABBV);
		s.setFaculty(EFaculty.MK);
		assertNotEquals("test not to be CSIE", EFaculty.CSIE, s.getFaculty());
		assertNotEquals("test not to be FABBV", EFaculty.CSIE, EFaculty.FABBV);
		assertNotEquals("test not to be MAN", EFaculty.CSIE, EFaculty.MN);
		
	}

}
