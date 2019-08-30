package cts.examen.s2.pattern2;

public class ProgMain {

	public static void main(String[] args) {
		NewPatient newPatient=new NewPatient("Ion fara Maria", true, true, 30); // is conscious
		System.out.println(newPatient.getDescription());
		AClientWithCompanion patientWithCompanion=new PatientWithCompanion(newPatient, "Maria");
		patientWithCompanion.descrie();
		System.out.println();
		
		NewPatient newPatient2 =new NewPatient("Vasile fara Ioana", true, false, 38);  //is unconscious
		System.out.println(newPatient.getDescription());
		AClientWithCompanion patientWithCompanion2=new PatientWithCompanion(newPatient2, "Ioana");
		patientWithCompanion2.descrie();

	}

}
