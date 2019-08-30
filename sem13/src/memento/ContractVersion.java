package memento;

public class ContractVersion {
	//the memento class from the diagram
	private String contractCluases;

	public ContractVersion(String contractCluases) {
		super();
		this.contractCluases = contractCluases;
	}

	public String getContractCluases() {
		return contractCluases;
	}
	
	
}
