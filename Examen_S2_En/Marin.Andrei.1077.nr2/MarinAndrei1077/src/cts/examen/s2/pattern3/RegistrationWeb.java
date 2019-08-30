package cts.examen.s2.pattern3;

import cts.examen.s2.pattern1.Patient;

public class RegistrationWeb extends TemplateRegistration {

	public RegistrationWeb(Patient patient) {
		super(patient);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void askName() {
		System.out.println(" Web Asked name  " + this.patient.getName());
		
	}

	@Override
	public void askMedicalRecords() {
		System.out.println("Web Asked medical records");
		
	}

	@Override
	public void askEmail() {
		System.out.println("Web asked email");
		
	}

	@Override
	public void askSocialNumber() {
		System.out.println("Mobile asked social Number");
		
	}

	@Override
	public void askCreditCard() {
		System.out.println("Mobile asked credit card");
		
	}

}
