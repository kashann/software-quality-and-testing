package ZM.Strategy;
import java.util.ArrayList;

import ZM.Singleton.Comanda;


public class StrategieB implements IStrategy{

	@Override
	public Comanda alegereComanda(ArrayList<Comanda> listaComenzi) {
		return listaComenzi.get(0);
	}

}
