package ZM.Singleton;
import java.util.ArrayList;

import ZM.State.StareAcceptata;
import ZM.Strategy.IStrategy;


public class MagazinOnline {
	public static MagazinOnline instance = null;
	private double materiePrimaDisponibila;
	private double mpGheata = 10;
	private double mpCizma = 8;
	private int nrComenzi = 0;
	private ArrayList<Comanda> listaComenzi = new ArrayList<>();
	private ArrayList<Comanda> listaComenziFinalizate = new ArrayList<>();
	private IStrategy strategie;
	
	private MagazinOnline(){	
	}
	
	public static MagazinOnline getInstance(){
		if(null == instance){
			instance = new MagazinOnline();
		}
		return instance;
	}
	
	public void addMateriePrima(double cantitate){
		materiePrimaDisponibila += cantitate;
	}
	
	public void removeMateriePrima(double cantitate){
		materiePrimaDisponibila -= cantitate;
	}

	public double getMateriePrimaDisponibila() {
		return materiePrimaDisponibila;
	}

	public double getMpGheata() {
		return mpGheata;
	}

	public double getMpCizma() {
		return mpCizma;
	}
	
	public int getCodComanda(){
		return ++nrComenzi;
	}
	
	public void addComanda(Comanda c){
		listaComenzi.add(c);
	}
	
	public void procesareComenzi(){
		int ok =1;
		Comanda c;
		while(this.getMateriePrimaDisponibila()>=0 && listaComenzi.size()>0 && ok == 1){
			c = strategie.alegereComanda(listaComenzi);
			if(materiePrimaDisponibila > c.getPantof().calculMateriePrima()){
				materiePrimaDisponibila -= c.getPantof().calculMateriePrima();
				c.setStareComanda(new StareAcceptata());
				listaComenzi.remove(c);
				listaComenziFinalizate.add(c);
			}
			else
				ok = 0;
		}
	}

	public void setStrategie(IStrategy strategie) {
		this.strategie = strategie;
	}
	
	public void afisareComenziRamase(){
		System.out.println("LISTA COMENZI RAMASE");
		for(Comanda c: listaComenzi)
			System.out.println(c);
	}
	
	public void afisareComenziFinalizate(){
		System.out.println("LISTA COMENZI FINALIZATE");
		for(Comanda c: listaComenziFinalizate)
			System.out.println(c);
	}
}
