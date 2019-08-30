import java.util.HashMap;

public class PrototypeFactoryContract {
	private static HashMap<String, AContract> prototypeContract = new HashMap<>();
	
	static {
		System.out.println("Init prototypes");
		AContract partyContract = new ContractParty();
		prototypeContract.put("party", partyContract);
		AContract corporateContract = new ContractCorporate();
		prototypeContract.put("corporate", corporateContract);
	}
	
	public static AContract getPrototypeContract(String type) throws CloneNotSupportedException {
		AContract contract = null;
		AContract prototype = prototypeContract.get(type);
		if(prototype != null) {
			contract = prototype.clone();
		}
		
		return contract;
	}
}
