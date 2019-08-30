package ZM.Factory;


public class PantofFactory {
	public static APantof crearePantof(EPantof tipPantof, int marime){
		APantof pantof = null;
		switch(tipPantof){
		case GHEATA:
			pantof = new Gheata();
			pantof.marime = marime;
			break;
		case CIZMA:
			pantof = new Cizma();
			pantof.marime = marime;
			break;
		}
		return pantof;
	}
}
