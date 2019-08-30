package Builder;

public class BuilderParty implements IBuilder {
	//complex object that we are creating
	private Party party;
	
	public BuilderParty(String clientName) {
		this.party = new Party(clientName);
	}
	
	//methods for building parts of the complex object
	public BuilderParty buildNoPersons(int noPersons, int noChildren) {
		party.setNoPersons(noPersons);
		party.setNoChildren(noChildren);
		return this;
	}
	
	public BuilderParty buildMenu(String menuType) {
		party.setMenuType(menuType);
		return this;
	}
	
	@Override
	public Party build() {
		return party;
	}

}
