import java.util.ArrayList;

public abstract class AContract implements Cloneable{
	protected int id;
	protected String name;
	protected ArrayList<Object> listOfDetails;
	
	public abstract void print();

	@Override
	protected AContract clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (AContract) super.clone();
	}

	public ArrayList<Object> getListOfDetails() {
		return listOfDetails;
	}

	
}
