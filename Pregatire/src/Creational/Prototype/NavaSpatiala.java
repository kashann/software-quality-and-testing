package Creational.Prototype;

import java.util.ArrayList;

public class NavaSpatiala extends Model3D{ //concrete prototype

	public NavaSpatiala(String tip) {
		System.out.println("Incarcare model 3D pentru nava spatiala...");
		poligoane = new ArrayList<>(100);
		this.tip = tip;
	}
	
	@Override
	void draw() {
		System.out.println("Nava spatiala de tip " + this.tip);
	}

}
