public class CTSMath {
	public static int nrCifre(int nr) {
		if (nr < 10)
			return 1;
		else if (nr < 100)
			return 2;
		else if (nr < 1000)
			return 3;
		else
			return nrCifre(nr / 100);
	}

	public static float getPretProdus(IProdus produs) {
		if (produs.isOnSale())
			if (produs.getPrice() > 100)
				return produs.getPrice() - 50;
			else
				return produs.getPrice() * 0.8f;
		else
			return produs.getPrice();
	}
}
