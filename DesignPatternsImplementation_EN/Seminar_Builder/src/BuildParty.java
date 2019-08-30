
public class BuildParty implements IBuilder{
	private Party party;
	
	public BuildParty(String clientName) {
		party = new Party(clientName);
	}
	
	//implementing methods to set modules
	public BuildParty setNoChildren(int noChildren) {
		party.setNoChildren(noChildren);
		return this;
	}
	
	public BuildParty setNoHours(int noHours) {
		party.setNoHours(noHours);
		return this;
	}

	@Override
	public Party build() {
		return party;
	}

}
