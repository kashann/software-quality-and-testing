package S8.G1077.Nadeem.Kashan.testUnits;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import S8.G1077.Nadeem.Kashan.classes.DontRun;
import S8.G1077.Nadeem.Kashan.classes.Ingredient;
import S8.G1077.Nadeem.Kashan.classes.Pizza;
import S8.G1077.Nadeem.Kashan.exceptions.IngredientException;
import S8.G1077.Nadeem.Kashan.exceptions.PizzaException;

public class TestGetIngredientWithMaxQuantity {

	@Test
	public void testRight() {
		try {
			Ingredient i1 = new Ingredient(1000, "Flour");
			Ingredient i2 = new Ingredient(200, "Ketchup");
			Ingredient i3 = new Ingredient(100, "Eggs");

			Pizza p = new Pizza(30, "Margherita");
			p.adaugaIngredient(i1); //doesnt pass this method :(
			p.adaugaIngredient(i2);
			p.adaugaIngredient(i3);
			
			assertEquals("Flour", p.getIngredientWithMaxQuantity());
		} catch (IngredientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PizzaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	@Test
	public void testException() {
		try {
			Pizza p = new Pizza(30, "Margherita");
			p.adaugaIngredient(new Ingredient(1000, "Flour"));
			p.adaugaIngredient(new Ingredient(200, "Ketchup"));
			p.adaugaIngredient(new Ingredient(100, "Eggs"));
			String ingredient = p.getIngredientWithMaxQuantity().toString();
			assertTrue("It didnt generated an exception where it should have", false);
		} catch (IngredientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PizzaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue("Exception generated where it should", true);
		}
		
	}
	
	@Category(DontRun.class)
	@Test
	public void testBoundary() {
		Pizza p = new Pizza(30, "Margherita");
		try {
			assertEquals("No ingredients", p.getIngredientWithMaxQuantity().toString());
		} catch (PizzaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
		
	}
	
	@Category(DontRun.class)
	@Test(timeout = 10)
	public void testPerformance() {
		Pizza p = new Pizza(30, "Margherita");
		for(int i = 0; i < 10; i++)
			try {
				p.adaugaIngredient(new Ingredient(i+1, "Ingredient " + i));
			} catch (IngredientException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
