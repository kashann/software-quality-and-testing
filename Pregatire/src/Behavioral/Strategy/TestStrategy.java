package Behavioral.Strategy;

public class TestStrategy {

	public static void main(String[] args) {
		ColectieDate cd = new ColectieDate(5);
		IProcesabil suma = new StrategieSuma();
		IProcesabil medie = new StrategieMedie();
		cd.setStrategie(suma);
		System.out.println(cd.proceseazaDate());
		cd.setStrategie(medie);
		System.out.println(cd.proceseazaDate());
	}

}
