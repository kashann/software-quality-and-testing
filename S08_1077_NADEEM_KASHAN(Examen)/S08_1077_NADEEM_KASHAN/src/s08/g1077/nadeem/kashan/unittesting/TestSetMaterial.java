package s08.g1077.nadeem.kashan.unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

import s08.g1077.nadeem.kashan.flyweight.Block;
import s08.g1077.nadeem.kashan.flyweight.Block.TipMaterial;

public class TestSetMaterial {

	@Test
	public void exceptionTest() {		
		try {
			Block b = new Block(TipMaterial.lemn, 6);
			b.setMaterial(null);
			assertTrue(false);
		} catch (MaterialException e) {
			assertTrue(true);
			e.printStackTrace();
		}
		
	}

}
