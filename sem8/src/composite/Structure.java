package composite;

import java.util.ArrayList;

public class Structure extends ANode{
	private ArrayList<ANode> children = new ArrayList<>();
	private String nameStructure;
	
	@Override
	public String getName() {
		throw new UnsupportedOperationException();
	}

	@Override
	public int getPrice() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getInfo() {
		String info = nameStructure;
		
		for(ANode node: children)
			info += "\n" + node.getInfo();
		
		return info;
	}

	@Override
	public void addNode(ANode node) {
		children.add(node);
	}

	@Override
	public void removeNode(ANode node) {
		children.remove(node);
	}

	@Override
	public ANode getNode(int i) {
		return children.get(i);
	}

	public Structure(String nameStructure) {
		super();
		this.nameStructure = nameStructure;
	}

}
