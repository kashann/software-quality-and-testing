package Structurale.Composite;

public abstract class ANod { //component interface
	//interfata publica pentru atributele unui nod
	public abstract String getNume();
	public abstract String getPost();
	public abstract double getSalariu();
	
	//metoda pentru afisarea datelor unui angajat
	public String getInfo() {
		return this.getNume() + " - " + this.getPost();
	}
	
	//interfata publica pentru gestiunea colectiei de noduri
	
	//metoda pentru a adauga un nod la structura ierarhica
	public void adaugaNodCopil(ANod elementStructura) {
		throw new UnsupportedOperationException();
	}
	
	//metoda pentru a sterge un nod din structura ierarhica
	public void stergeNodCopil(ANod elementStructura) {
		throw new UnsupportedOperationException();		
	}
	
	//metoda pentru a extrage un nod din structura ierarhica
	public ANod getNodCopil(int i) {
		throw new UnsupportedOperationException();
	}
}
