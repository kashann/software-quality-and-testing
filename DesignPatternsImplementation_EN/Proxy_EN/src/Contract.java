
public class Contract implements IContract{
	private String text;
	
	public Contract(String text) {
		super();
		this.text = text;
		printContract();
	}

	@Override
	public void copyContract() {
		System.out.println("Multiplying contract");
	}
	
	public void printContract() {
		//method used only one time at the creation of the object
		System.out.println("Printing contract");
	}

}
