
public class TestFlyWeight {

	public static void main(String[] args) {
		CheckFactory checkFactory = new CheckFactory();
		ClientCheckInfo[] clientCheckInfo = new ClientCheckInfo[100];
		
		clientCheckInfo[0] = new ClientCheckInfo("Gigel", "21/09/2015");
		Check check1 = checkFactory.getCheck("Or else you...");
		check1.printCheck(clientCheckInfo[0]);
		
		clientCheckInfo[1] = new ClientCheckInfo("Marin", "22/10/2016");
		Check check2 = checkFactory.getCheck("RON");
		check2.printCheck(clientCheckInfo[1]);
		
		clientCheckInfo[2] = new ClientCheckInfo("Popescu", "23/12/2017");
		Check check3 = checkFactory.getCheck("Or else you...");
		check3.printCheck(clientCheckInfo[2]);
		
		System.out.println("Nr obj: " + checkFactory.getNoCheck());
	}

}
