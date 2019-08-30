package cts.examen.s2.pattern2;

public abstract class AClientWithCompanion {
	NewPatient oldPacient;
	String companion;
	
	
	
	public AClientWithCompanion(NewPatient oldPacient, String companion) {
		super();
		this.oldPacient = oldPacient;
		this.companion = companion;
	}



	public abstract void descrie();
}
