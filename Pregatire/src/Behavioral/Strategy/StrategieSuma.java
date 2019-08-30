package Behavioral.Strategy;

public class StrategieSuma implements IProcesabil{

	@Override
	public int proceseaza(int[] valori) {
		if(valori == null)
			return 0;
		int suma = 0;
		for(int i = 0; i < valori.length; i++)
			suma += valori[i];
		return suma;
	}
	

}
