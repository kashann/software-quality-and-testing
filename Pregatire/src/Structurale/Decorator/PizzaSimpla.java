package Structurale.Decorator;

public class PizzaSimpla extends AbstractPizza{
	//concrete component
	public PizzaSimpla(String Denumire, float Pret) {
		this.denumire = Denumire;
		this.pret = Pret;
	}
	
	@Override
	public String getIngrediente() {
		return "Blat simplu, rosii";
	}

}
