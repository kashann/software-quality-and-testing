import java.util.ArrayList;

public class Structure extends ANode{
	private ArrayList<ANode> children = new ArrayList<>();
	private String nameStructure;
	
	public Structure(String nameStructure) {
		super();
		this.nameStructure = nameStructure;
	}

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
		String info = nameStructure + "\n";
		
		for(ANode node: children) 
			info += node.getInfo() + "\n";
		
		return info;
	}

	@Override
	public void addNode(ANode node) {
		// TODO Auto-generated method stub
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
}
