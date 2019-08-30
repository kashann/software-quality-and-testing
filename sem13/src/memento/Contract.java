package memento;

public class Contract {
	//the originator class from the diagram
	private String clientName;
	private String contractClauses;
	
	public Contract(String clientName) {
		super();
		this.clientName = clientName;
	}
	
	public void addClause(String newClause) {
		this.contractClauses += "\n" + newClause;
	}

	@Override
	public String toString() {
		return "Contract [clientName=" + clientName + ", contractClauses=" + contractClauses + "]";
	}
	
	//saving one memento from the object
	public ContractVersion saveToMemento() {
		return new ContractVersion(contractClauses);
	}
	
	//restore from memento
	public void restoreFromMemento(ContractVersion cv) {
		this.contractClauses = cv.getContractCluases();
	}
}
