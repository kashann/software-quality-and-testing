package decorator;

public class PizzaRomana extends APizza{
	 @Override
	 public String getComponents() {
		 return "dough, tomatoes sauce, cheese, hame";
	 }
	 
	 @Override
	 public int getPrice() {
		 return 25;
	 }
}
