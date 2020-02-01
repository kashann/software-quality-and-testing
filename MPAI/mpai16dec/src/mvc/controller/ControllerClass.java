package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.model.Angajat;
import mvc.view.ViewClass;

public class ControllerClass {
	public ViewClass view;
	public Angajat angajat;
	
	public ControllerClass(ViewClass view) {
		this.view = view;
		btnAddListner();
		angajat = new Angajat();
	}	

	public ViewClass getView() {
		return view;
	}

	public void setView(ViewClass view) {
		this.view = view;
	}

	public Angajat getAngajat() {
		return angajat;
	}

	public void setAngajat(Angajat angajat) {
		this.angajat = angajat;
		view.refresh(angajat);
	}
	
	public void btnAddListner() {
		view.btn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				angajat.setSalary(Integer.parseInt(view.tf2.getText()));
				//view.refreshUI(angajat);
			}
		});
	}
}
