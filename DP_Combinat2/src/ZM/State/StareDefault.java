package ZM.State;

public class StareDefault implements IStare{

	@Override
	public void getInfoComanda() {
		System.out.println("In curs de prelucrare");
	}

	@Override
	public String toString() {
		return "StareDefault";
	}
}
