package cts.examen.s2.unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMinDrugPrice {

	@Test
	public void testCardinalityZero() {
		String patientName="andreiMarin";
		float bodyTemp=38f;
		boolean isUnconscious=true;
		float prices[]= {};
		
		try {
			IncomingPatient patient1=new IncomingPatient(patientName, isUnconscious, bodyTemp);
			float Minimum=patient1.minDrugPrice(prices);
			fail();
		}catch(PatientException e) {
			fail();
		}catch(DrugException e) {
			assertTrue(true);
		}
		
	}
	
	
	@Test 
	public void testCardinality1() {
		String patientName="andreiMarin";
		float bodyTemp=38f;
		boolean isUnconscious=true;
		float prices[]= {1001};
		
		try {
			IncomingPatient patient1=new IncomingPatient(patientName, isUnconscious, bodyTemp);
			float Minimum=patient1.minDrugPrice(prices);
			assertEquals(1001, Minimum, 0.1);
		}catch(PatientException e) {
			fail();
		}catch(DrugException e) {
			fail();
		}
	}

}
