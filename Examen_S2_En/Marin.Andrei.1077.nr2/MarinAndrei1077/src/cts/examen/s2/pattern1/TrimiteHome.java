package cts.examen.s2.pattern1;

public class TrimiteHome extends Trimitere{

	@Override
	public void trimite(Patient patient) {
		if(patient.isBleeding==false && patient.isUnconscious==false && patient.getBodyTemp()<40) {
		System.out.println(patient.getName()+" Trimis acasa");
	}else {
		super.getSuccesor().trimite(patient);
	}
	
	}
}
