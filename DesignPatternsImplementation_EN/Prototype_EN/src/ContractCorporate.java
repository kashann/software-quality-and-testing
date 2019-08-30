import java.util.ArrayList;

public class ContractCorporate extends AContract{

	
	
	public ContractCorporate() {
		System.out.println("Constructor for Corporate");
		listOfDetails = new ArrayList<>();
	}

	@Override
	public void print() {
		System.out.println("Contract corporate with id "+
				this.id +" is printing");
	}

}
