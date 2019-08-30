package proxy;

public class ProxyContract implements IContract{
	//the object that the proxy manages
	private Contract contract;
	private String text;

	public ProxyContract(String text) {
		super();
		this.text = text;
	}

	@Override
	public void copyContract() {
		if(contract == null)
			contract = new Contract(text);
		contract.copyContract();
	}

}
