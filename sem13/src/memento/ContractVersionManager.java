package memento;

import java.util.ArrayList;

public class ContractVersionManager {
	//care taker class
	private ArrayList<ContractVersion> versions = new ArrayList<>();
	
	public void add(ContractVersion cv) {
		this.versions.add(cv);
	}
	
	public ContractVersion get(int index) {
		return this.versions.get(index);
	}
}
