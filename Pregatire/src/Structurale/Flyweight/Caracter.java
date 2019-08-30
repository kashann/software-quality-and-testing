package Structurale.Flyweight;

public class Caracter implements CaracterPrintabil{
	private final String caracter;

	public Caracter(String caracter) {
		super();
		this.caracter = caracter;
	}

	public String getCaracter() {
		return caracter;
	}

	@Override
	public void printCaracter(CaracterContext context) {
		System.out.println(this.caracter + " este pe pozitia " + context.getPozitie());
	}

}
