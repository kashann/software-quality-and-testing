package Builder;

public class TestBuilder {

	public static void main(String[] args) {
		Party party = new BuilderParty("Gigel").buildNoPersons(100,  5).
				buildMenu("Menu Type A").build();
		System.out.println(party);
	}

}
