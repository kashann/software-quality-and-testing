package cts.examen.s2.pattern3;

import cts.examen.s2.pattern1.Patient;

public abstract class TemplateRegistration {
	Patient patient;
	 
	
	public TemplateRegistration(Patient patient) {
		super();
		this.patient = patient;
	}
	public abstract void askName();
	public abstract void askMedicalRecords();
	public abstract void askEmail();
	public abstract void askSocialNumber();
	public abstract void askCreditCard();
	
	public final void inregistreaza() {
		askName();
		askSocialNumber();
		askMedicalRecords();
		askCreditCard();
		askEmail();
	}
}
