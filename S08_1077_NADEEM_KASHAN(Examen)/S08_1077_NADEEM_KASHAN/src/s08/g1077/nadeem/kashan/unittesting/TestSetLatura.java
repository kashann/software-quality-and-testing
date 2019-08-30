package s08.g1077.nadeem.kashan.unittesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import s08.g1077.nadeem.kashan.flyweight.Block;
import s08.g1077.nadeem.kashan.flyweight.Block.TipMaterial;

public class TestSetLatura {

	@Test
	public void boundaryTestMin() {
		Block b = new Block(TipMaterial.nisip, 8);
		b.setLatura(0);
		assertEquals(0, b.getLatura());
	}
	
	@Category(ExcludedFromTesting.class)
	@Test
	public void boundaryTestMax() {
		Block b = new Block(TipMaterial.nisip, 8);
		b.setLatura(10);
		assertEquals(10, b.getLatura());
	}

}
