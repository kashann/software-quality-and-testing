package composite;

public abstract class ANode {
	//abstract methods for the leafs
	
	public abstract String getName();
	public abstract int getPrice();
	
	//general method for all nodes
	public String getInfo() {
		//will be implemented for the leafs
		return getName() + " " + getPrice();
	}
	
	//methods for the intermediate nodes (structure)
	public void addNode(ANode node) {
		throw new UnsupportedOperationException();
	}
	
	public void removeNode(ANode node) {
		throw new UnsupportedOperationException();
	}
	
	public ANode getNode(int i) {
		throw new UnsupportedOperationException();
	}
}
