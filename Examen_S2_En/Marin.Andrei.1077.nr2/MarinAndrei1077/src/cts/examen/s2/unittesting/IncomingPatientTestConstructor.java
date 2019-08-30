package cts.examen.s2.unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class IncomingPatientTestConstructor {

	@SuppressWarnings("deprecation")
	@Test
	public void testRight() throws PatientException {
		String patientName="andreiMarin";
		float bodyTemp=38f;
		boolean isUnconscious=true;
		
		IncomingPatient patient1=new IncomingPatient(patientName, isUnconscious, bodyTemp);
		assertEquals(patientName, patient1.getName());
		assertEquals(bodyTemp,patient1.getBodyTemp(), 0.1);
		assertEquals(true, patient1.isUnconscious);
		
	}
	
	@Test
	public void testConstructorException() {
		String patientName="andreiMarin";
		float bodyTemp=60f; // body temp out of bounds
		boolean isUnconscious=true;
		
		try {
			IncomingPatient patient1=new IncomingPatient(patientName, isUnconscious, bodyTemp);
			fail();
		}catch(PatientException e) {
			assertTrue(true);
		}
		
	}

}
