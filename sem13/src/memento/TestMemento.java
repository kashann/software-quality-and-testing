package memento;

public class TestMemento {
	public static void main(String[] args) {
		ContractVersionManager careTaker = new ContractVersionManager();
		Contract contract = new Contract("Costachescu");
		
		contract.addClause("Clause 1");
		System.out.println(contract);
		System.out.println("-------------------");
		
		contract.addClause("Clause 2");
		System.out.println(contract);
		careTaker.add(contract.saveToMemento());
		System.out.println("-------------------");
		
		contract.addClause("Clause 3");
		System.out.println(contract);
		System.out.println("-------------------");
		
		//restore from memento
		contract.restoreFromMemento(careTaker.get(0));
		System.out.println(contract);
		System.out.println("-------------------");
		
		//ContractVersion memento = careTaker.get(0);
		//contract.restoreFromMemento(memento);
	}
}
