package cts.examen.s2.pattern2;

public class PatientWithCompanion extends AClientWithCompanion {

	public PatientWithCompanion(NewPatient oldPacient, String companion) {
		super(oldPacient, companion);
		
	}

	@Override
	public void descrie() {
		if(oldPacient.isUnconscious) {
		System.out.println(this.oldPacient.getDescription());
		}else {
			if(!oldPacient.isUnconscious) {
				System.out.println(this.oldPacient.getDescription()+" ,my companion is "+this.companion);
			}
		}
		
	}
	
}
