package ZM.State;


public class StareAcceptata implements IStare{

	@Override
	public void getInfoComanda() {
		System.out.println("Comanda este acceptata. Va fi furnizata!");
	}

	@Override
	public String toString() {
		return "StareAcceptata";
	}
}
