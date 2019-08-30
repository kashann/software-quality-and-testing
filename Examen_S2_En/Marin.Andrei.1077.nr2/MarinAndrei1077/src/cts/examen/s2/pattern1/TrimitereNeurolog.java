package cts.examen.s2.pattern1;

public class TrimitereNeurolog extends Trimitere{

	@Override
	public void trimite(Patient patient) {
		if(patient.isUnconscious) {
			System.out.println(patient.getName()+" Sent to neurologist");
		}else {
			super.getSuccesor().trimite(patient);
		}
		
	}
	
}
