package S8.G1077.Nadeem.Kashan.testUnits;

import static org.junit.Assert.*;

import org.junit.Test;

import S8.G1077.Nadeem.Kashan.classes.Ingredient;
import S8.G1077.Nadeem.Kashan.exceptions.IngredientException;

public class TestIngredientConstructor {

	@Test
	public void testRight() {
		try {
			Ingredient i = new Ingredient(1000, "Flour");
			assertEquals(1000, i.getQuantityInGrams());
			assertEquals("Flour", i.getName());
		} catch (IngredientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	@Test
	public void testException() {
		try {
			Ingredient i = new Ingredient(2500, "Flour");
			assertTrue(false);
		} catch (IngredientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue("Exception generated where it should", true);
		}
	}
	
	@Test
	public void testBoundaryLow() {
		Ingredient i;
		try {
			i = new Ingredient(1, "Ou");
			assertEquals(1, i.getQuantityInGrams());
			assertEquals("Ou", i.getName());
		} catch (IngredientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	@Test
	public void testBoundaryHigh() {
		Ingredient i;
		try {
			i = new Ingredient(1999, "Mozzarella");
			assertEquals(1999, i.getQuantityInGrams());
			assertEquals("Mozzarella", i.getName());
		} catch (IngredientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}

}
