package ZM.State;


public class StareRefuzata implements IStare{

	@Override
	public void getInfoComanda() {
		System.out.println("Comanda refuzata. Materie prima insuficienta");
	}

	@Override
	public String toString() {
		return "StareRefuzata";
	}
}
