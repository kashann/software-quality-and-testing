package Structurale.Flyweight;

public class TestFlyweight {
	private static Caracter[] caractereText = new Caracter[100];
	private static CaracterContext[] pozitiiCaractere = new CaracterContext[100];
	private static int nrCaractere = 0;
	
	public static void apasaTasta(String caracter, int poz, CaracterFactory factory) {
		caractereText[nrCaractere] = factory.getCaracter(caracter);
		pozitiiCaractere[nrCaractere] = new CaracterContext(poz);
		nrCaractere++;
	}

	public static void main(String[] args) {		
		CaracterFactory factory = new CaracterFactory();
		apasaTasta("a", nrCaractere, factory);
		apasaTasta("b", nrCaractere, factory);
		apasaTasta("b", nrCaractere, factory);
		apasaTasta("c", nrCaractere, factory);
		apasaTasta("c", nrCaractere, factory);
		apasaTasta("c", nrCaractere, factory);
		apasaTasta("d", nrCaractere, factory);
		apasaTasta("d", nrCaractere, factory);
		apasaTasta("d", nrCaractere, factory);
		apasaTasta("d", nrCaractere, factory);
//		apasaTasta("e", nrCaractere, factory);
//		apasaTasta("e", nrCaractere, factory);
//		apasaTasta("e", nrCaractere, factory);
//		apasaTasta("e", nrCaractere, factory);
//		apasaTasta("e", nrCaractere, factory);
		
		for(int i = 0; i < nrCaractere; i++) {
			caractereText[i].printCaracter(pozitiiCaractere[i]);
		}
		
		System.out.println("\nNr obiecte create: " + factory.getNrCaractere());
	}
}