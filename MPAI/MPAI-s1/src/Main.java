
public class Main {
	public static void main(String[] args) {
		Client popescu = new Client(1, "Popescu", "Piata Romana");
		popescu.afiseaza();
		popescu.salveaza();
		Client popescu2 = new Client();
		popescu2.restaureaza("1.txt");
		popescu2.afiseaza();
		
		Client2 ionescu = new ClientBronze(2, "Ionescu", "Piata Victoriei");
		ionescu.afiseaza();
		Util.salveaza(ionescu);
		Client2 ionescu2 = Util.restaureaza("2.txt");
		ionescu2.afiseaza();
		
		System.out.println("Discount POPESCU: " + popescu.getDiscount() + "%");
		popescu2.setTipClient(TIP_CLIENT.GOLD);
		System.out.println("Discount POPESCU2: " + popescu2.getDiscount() + "%");
		
		Client2 marin = new ClientSilver(3, "Marin", "Titan");
		marin.afiseaza();
		Client2 neagu = new ClientGold(4, "Neagu", "Berceni");
		neagu.afiseaza();
		Client2 caragea = new ClientPlatinum(5, "Caragea", "Galati");
		caragea.afiseaza();
		Client2 ienculescu = new ClientDiamond(6, "Ienculescu", "Mogosoaia");
		ienculescu.afiseaza();
	}	
}

