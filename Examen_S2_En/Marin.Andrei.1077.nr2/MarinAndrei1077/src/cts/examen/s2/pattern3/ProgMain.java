package cts.examen.s2.pattern3;

import cts.examen.s2.pattern1.Patient;

public class ProgMain {

	public static void main(String[] args) {
		Patient patient=new Patient("ion", false, false, 30);
		TemplateRegistration registrationMobile=new Registration(patient);
		registrationMobile.inregistreaza();
		
		TemplateRegistration registrationWeb=new RegistrationWeb(patient);
		registrationWeb.inregistreaza();

	}

}
