package S8.G1077.Nadeem.Kashan.classes;

import java.util.ArrayList;

import S8.G1077.Nadeem.Kashan.exceptions.PizzaException;

public class Pizza {
	
	public static final int minDeliveryTime = 30;
	public static final int maxDeliveryTime = 60;
	public static final int averageBakingTime = 15;
	
	double price;
	String name;
	ArrayList<Ingredient> ingredients;
	
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Pizza(double price, String name) {
		this.price = price;
		this.name = name;
	}


	public ArrayList<Ingredient> getIngrediente() {
		return ingredients;
	}


	public void adaugaIngredient(Ingredient ingredient){
		ingredients.add(ingredient);
	}
	
	public String getIngredientWithMaxQuantity() throws PizzaException{
		Ingredient cautat = this.ingredients.get(0);
		int found = 0;
		int nr = 0;
		
		for(Ingredient ingredient : this.ingredients) {
			if(ingredient.getQuantityInGrams() > cautat.getQuantityInGrams()) {
				cautat = ingredient;
				found++;
			}
			nr++;
		}
			
		if(found == 0 && nr > 0)
			throw new PizzaException();
		if (nr == 0)
			return "No ingredients";
		
		return cautat.getName();
	}
	
	public float getDeliveryTime(OvenInterface oven){
		if(oven.getBakingTime(this) < averageBakingTime)
			return minDeliveryTime;
		else
			return maxDeliveryTime;
	}
}
