package ZM.Strategy;
import java.util.ArrayList;

import ZM.Singleton.Comanda;


public interface IStrategy {
	Comanda alegereComanda(ArrayList<Comanda> listaComenzi);
}
