package sem7Factory;

import java.util.ArrayList;

public class ContractParty extends AContract{

	public ContractParty() {
		System.out.println("Constructor for Party");
		listOfDetails = new ArrayList<>(10);
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Contract party with id " + this.id + " is printing.");
	}

}
