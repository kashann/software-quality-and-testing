
public class Party {
	private int noPersons;
	private int noChildren;
	private String menuType;
	private int noHours;
	private String clientName;
	
	public Party(String clientName) {
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

	public int getNoHours() {
		return noHours;
	}

	public void setNoHours(int noHours) {
		this.noHours = noHours;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	@Override
	public String toString() {
		return "Party [noPersons=" + noPersons + ", noChildren=" + noChildren
				+ ", menuType=" + menuType + ", noHours=" + noHours
				+ ", clientName=" + clientName + "]";
	}
	
	
}
