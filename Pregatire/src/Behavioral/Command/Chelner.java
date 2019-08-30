package Behavioral.Command;

import java.util.ArrayList;

public class Chelner { //invoker
	public ArrayList<ComandaBucatarie> comenzi;
	int numarMasa;
	
	public Chelner(int numarMasa) {
		this.numarMasa = numarMasa;
		comenzi = new ArrayList<ComandaBucatarie>();
	}
	
	public void preiaComanda(ComandaBucatarie comanda) {
		this.comenzi.add(comanda);
	}
	
	public void trimiteComenzi() {
		for(ComandaBucatarie comanda : comenzi)
			comanda.gateste();
		this.comenzi.clear();
	}
}
