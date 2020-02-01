package mvc;

import mvc.model.Angajat;
import mvc.controller.ControllerClass;
import mvc.view.ViewClass;

public class Main {

	public static void main(String[] args) {
		ViewClass v = new ViewClass();
		Angajat angajat = new Angajat("Ionel", 2000);
		angajat.addObserver(v);
		ControllerClass controller = new ControllerClass(v);
		controller.setAngajat(angajat);
	}

}
