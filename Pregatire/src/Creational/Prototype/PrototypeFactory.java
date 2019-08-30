package Creational.Prototype;

import java.util.HashMap;

public class PrototypeFactory { //client?
	private static HashMap<String, Model3D> prototipuri = new HashMap<>();
	
	static {
		//incarca prototipuri
		System.out.println("\nInitializare prototipuri modele...");
		NavaSpatiala modelNava = new NavaSpatiala("Nava tip 1");
		modelNava.setId("nava");		
		prototipuri.put("nava", modelNava);
		
		Asteroid modelAsteroid = new Asteroid();
		modelAsteroid.setId("asteroid");
		prototipuri.put("asteroid", modelAsteroid);
	}
	
	public static Model3D getPrototip(String id) {
		Model3D copiePrototip = null;
		Model3D prototip = prototipuri.get(id);
		if(prototip != null)
			copiePrototip = (Model3D)prototip.clone();
		
		return copiePrototip;
	}
}
