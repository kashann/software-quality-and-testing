
public class TestBuilder {

	public static void main(String[] args) {
		Party party1 = new BuildParty("Black and White Party").
				setNoChildren(10).build();
		System.out.println(party1);
	}

}
