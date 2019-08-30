package cts.examen.s2.pattern3;

import cts.examen.s2.pattern1.Patient;

//initial proposel
//the class can be changed 

public class Registration extends TemplateRegistration {
	
	public Registration(Patient patient) {
		super(patient);
		// TODO Auto-generated constructor stub
	}

	// must be the 1st step
	public void askName(){
		System.out.println(" Mobile Asked name   "+this.patient.getName());
	}
	
	// must be the 3rd step
	public void askMedicalRecords(){
		System.out.println("Mobile Asked medical records");
	}
	
	// must be the 5th step
	public void askEmail(){
		System.out.println("Mobile asked email");
	}
	
	// must be the 2nd step
	public void askSocialNumber(){
		System.out.println("Mobile asked social Number");
	}
	
	// must be the 4th step
	public void askCreditCard(){
		System.out.println("Mobile asked credit card");
	}
	

}
