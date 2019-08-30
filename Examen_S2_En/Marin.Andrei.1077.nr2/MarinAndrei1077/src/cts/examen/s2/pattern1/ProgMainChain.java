package cts.examen.s2.pattern1;

public class ProgMainChain {

	public static void main(String[] args) {
		Patient patient1=new Patient("ion", false, false, 38); //Ion goes home, Ion is fine
		Patient patient2=new Patient("vasile", true, true, 42); //Vasile is bleeding
		Patient patient3=new Patient("romica", false, true, 20); //Romica is unconscious
	
		Trimitere trimitereGenerala=new TrimitereDoctorGeneral();
		Trimitere trimitereNeurolog=new TrimitereNeurolog();
		Trimitere trimitereSurgical=new TrimitereSurgical();
		Trimitere trimitereAcasa=new TrimiteHome();
		trimitereSurgical.setSuccesor(trimitereAcasa);
		trimitereGenerala.setSuccesor(trimitereNeurolog);
		trimitereAcasa.setSuccesor(trimitereGenerala);
		
		trimitereSurgical.trimite(patient1);
		trimitereSurgical.trimite(patient2);
		trimitereSurgical.trimite(patient3);
		
	}

}
