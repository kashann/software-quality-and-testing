package Behavioral.Template;

public class TestTemplate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PachetTuristic p1 = new PachetCazare(1);
		PachetTuristic p2 = new PachetTransport(2);
		PachetTuristic p3 = new PachetCazareTransport(3);
		
		p1.vindePachet();
		System.out.println();
		p2.vindePachet();
		System.out.println();
		p3.vindePachet();
	}

}
