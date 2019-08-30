package cts.examen.s2.unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSetBodyTemp {

	@Test
	public void testException() {
		String patientName="andreiMarin";
		float bodyTemp=38f;
		boolean isUnconscious=true;
		
		try {
			IncomingPatient patient1=new IncomingPatient(patientName, isUnconscious, bodyTemp);
			patient1.setBodyTemp(70f);
			fail();
		}catch(PatientException e) {
			assertTrue(true);
		}
	}

}
