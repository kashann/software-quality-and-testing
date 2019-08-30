package cts.examen.s2.pattern1;

public class TrimitereDoctorGeneral extends Trimitere{

	@Override
	public void trimite(Patient patient) {
		if(patient.getBodyTemp()<40) {
			super.getSuccesor().trimite(patient);
		}else {
			System.out.println(patient.getName()+" Sent to the general doctor");
		}
		
	}
	

}
