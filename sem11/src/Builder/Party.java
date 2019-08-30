package Builder;

public class Party {
	//the complex object
	private String clientName;
	
	private int noPersons;
	private int noChildren;
	private String menuType;
	
	public Party(String clientName) {
		super();
		this.clientName = clientName;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public int getNoPersons() {
		return noPersons;
	}

	public void setNoPersons(int noPersons) {
		this.noPersons = noPersons;
	}

	public int getNoChildren() {
		return noChildren;
	}

	public void setNoChildren(int noChildren) {
		this.noChildren = noChildren;
	}

	public String getMenuType() {
		return menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	@Override
	public String toString() {
		return "Party [clientName=" + clientName + ", noPersons=" + noPersons + ", noChildren=" + noChildren
				+ ", menuType=" + menuType + "]";
	}
}
