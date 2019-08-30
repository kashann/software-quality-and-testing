package Creational.Builder;

public class TestBuilder {

	public static void main(String[] args) {
		ContBancar cont = new ContBancar();
		cont.setDetinator("Popescu Ion");
		cont.setSuma(100);
		cont.setMoneda("RON");
		cont.setContSalariu(true);
		cont.setInternetBanking(true);
		cont.setCardAtasat(true);		
		System.out.println(cont.toString());
		
		//using builder
		ContBancar cont2 = new ContBancarBuilder().setDetinator("Ionescu Vasile")
				.setSuma(2000).setCardAtasat(true).setContSalariu(true).build();
		System.out.println(cont2.toString());
	}

}
