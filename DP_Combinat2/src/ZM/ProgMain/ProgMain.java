package ZM.ProgMain;
import ZM.Factory.EPantof;
import ZM.Singleton.Comanda;
import ZM.Singleton.MagazinOnline;
import ZM.Strategy.StrategieA;


public class ProgMain {

	public static void main(String[] args) {
		//Singleton
		MagazinOnline magazin = MagazinOnline.getInstance();
		magazin.addMateriePrima(1000);
				
		//Factory
		Comanda c1 = new Comanda(EPantof.CIZMA,39,"rosu");
		Comanda c2 = new Comanda(EPantof.GHEATA,42,"negru");
		Comanda c3 = new Comanda(EPantof.CIZMA,36,"rosu");
		Comanda c4 = new Comanda(EPantof.GHEATA,40,"negru");
		magazin.addComanda(c1);
		magazin.addComanda(c2);
		magazin.addComanda(c3);
		magazin.addComanda(c4);
		
		//Strategy + State
		magazin.setStrategie(new StrategieA());
		
		System.out.println("MATERIE PRIMA:" + magazin.getMateriePrimaDisponibila());
		magazin.procesareComenzi();
		magazin.afisareComenziRamase();
		magazin.afisareComenziFinalizate();
		System.out.println("MATERIE PRIMA:" + magazin.getMateriePrimaDisponibila());
	}
}
