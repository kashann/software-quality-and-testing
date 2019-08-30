package Behavioral.Strategy;

public class ColectieDate {
	protected int valori[];
	protected IProcesabil strategie;
	
	public ColectieDate(int n) {
		valori = new int[n];
		for(int i = 0; i < n; i++)
			valori[i] = i + 1;
	}
	
	public void setStrategie(IProcesabil strategie) {
		this.strategie = strategie;
	}
	
	public int proceseazaDate() {
		if(strategie != null)
			return strategie.proceseaza(valori);
		else throw new UnsupportedOperationException();
	}
}
