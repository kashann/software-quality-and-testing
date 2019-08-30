
public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		//with Prototype DP
		AContract c1 = PrototypeFactoryContract.getPrototypeContract("party");
		AContract c2 = PrototypeFactoryContract.getPrototypeContract("party");
		
		if(c1.getListOfDetails() == c2.getListOfDetails())
			System.out.println("The same list of details");
		else
			System.out.println("Different list of details");
		
		//without Prototype
		AContract c3 = new ContractParty();
		AContract c4 = new ContractParty();
		
		if(c3.getListOfDetails() == c4.getListOfDetails())
			System.out.println("The same list of details");
		else
			System.out.println("Different list of details");
	}

}
