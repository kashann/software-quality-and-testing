package Structurale.Decorator;

public class TestDecorator {

	public static void main(String[] args) {
		
		PizzaSimpla margherita = new PizzaSimpla("margerita", 10);
		System.out.println(margherita.getIngrediente());
		
		DecoratorDiavola diavola = new DecoratorDiavola(margherita);
		System.out.println(diavola.getIngrediente());
		
		DecoratorExotica hawaii = new DecoratorExotica(margherita);
		System.out.println(hawaii.getIngrediente());
		
		DecoratorExotica exotica = new DecoratorExotica(diavola);
		System.out.println(exotica.getIngrediente());
	}
}
