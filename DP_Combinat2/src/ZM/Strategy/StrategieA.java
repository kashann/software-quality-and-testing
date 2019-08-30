package ZM.Strategy;
import java.util.ArrayList;

import ZM.Singleton.Comanda;


public class StrategieA implements IStrategy{

	@Override
	public Comanda alegereComanda(ArrayList<Comanda> listaComenzi) {
		Comanda comanda = listaComenzi.get(0);
		for(Comanda c: listaComenzi){
			if(c.getPantof().calculMateriePrima() < comanda.getPantof().calculMateriePrima())
				comanda = c;
		}
		return comanda;
	}

}
