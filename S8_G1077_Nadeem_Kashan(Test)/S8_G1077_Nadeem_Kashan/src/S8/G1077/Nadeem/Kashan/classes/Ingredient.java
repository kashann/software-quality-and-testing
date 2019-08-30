package S8.G1077.Nadeem.Kashan.classes;

import S8.G1077.Nadeem.Kashan.exceptions.IngredientException;

public class Ingredient {
	int quantityInGrams;
	String name;
	
	public Ingredient(int quantityInGrams, String name) throws IngredientException{
		if(quantityInGrams > 0 && quantityInGrams < 2000 && name.length() >= 2 && name.length() <= 100) {
			this.quantityInGrams = quantityInGrams;
			this.name = name;
		}
		else
			throw new IngredientException();			
	}

	public int getQuantityInGrams() {
		return quantityInGrams;
	}


	public void setQuantityInGrams(int quantityInGrams) throws IngredientException{
		if(quantityInGrams > 0 && quantityInGrams < 2000)
			this.quantityInGrams = quantityInGrams;
		else
			throw new IngredientException();			
	}


	public String getName() {
		return name;
	}

	public void setName(String name) throws IngredientException{
		if(name.length() >= 2 && name.length() <= 100)
			this.name = name;
		else
			throw new IngredientException();
	}

}
