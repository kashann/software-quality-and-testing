package sem7Factory;

import java.util.ArrayList;

public abstract class AContract implements Cloneable{
	protected int id;
	protected String name;
	protected ArrayList<Object> listOfDetails;
	
	public abstract void print();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Object> getListOfDetails() {
		return listOfDetails;
	}

	public void setListOfDetails(ArrayList<Object> listOfDetails) {
		this.listOfDetails = listOfDetails;
	}

	@Override
	protected AContract clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (AContract) super.clone();
	}
}
