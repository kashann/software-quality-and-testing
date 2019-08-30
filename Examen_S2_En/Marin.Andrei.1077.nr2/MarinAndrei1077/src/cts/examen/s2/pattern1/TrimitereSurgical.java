package cts.examen.s2.pattern1;

public class TrimitereSurgical extends Trimitere{

	@Override
	public void trimite(Patient patient) {
		if(patient.isBleeding()) {
			System.out.println(patient.getName()+" Sent to surgical");
		}else {
			super.getSuccesor().trimite(patient);
		}
		
	}

}
