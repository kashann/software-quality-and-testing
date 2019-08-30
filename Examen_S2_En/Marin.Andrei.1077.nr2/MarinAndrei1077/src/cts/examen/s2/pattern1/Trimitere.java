package cts.examen.s2.pattern1;

public abstract class Trimitere {
	Trimitere succesor;
	public abstract void trimite(Patient patient);
	public Trimitere getSuccesor() {
		return succesor;
	}

	public void setSuccesor(Trimitere succesor) {
		this.succesor = succesor;
	}
	
	
}
