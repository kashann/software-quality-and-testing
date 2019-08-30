package Structurale.Composite;

public class TestComposite {

	public static void main(String[] args) {
		Structura root = new Structura("echipa manageriala", "sub CEO");
		
		Structura dep = new Structura("echipa IT", "departament IT");		
		dep.adaugaNodCopil(new Angajat("Ionel", "programator"));
		dep.adaugaNodCopil(new Angajat("Gigel", "Retelist"));
		root.adaugaNodCopil(dep);
		root.adaugaNodCopil(new Angajat("Popescu", "manager"));
		root.adaugaNodCopil(new Angajat("Ionescu", "assitant manager"));
		
		System.out.println(root.getInfo());
	}

}
