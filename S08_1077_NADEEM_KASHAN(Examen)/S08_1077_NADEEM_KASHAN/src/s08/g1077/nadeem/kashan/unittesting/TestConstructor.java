package s08.g1077.nadeem.kashan.unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

import s08.g1077.nadeem.kashan.flyweight.Block;
import s08.g1077.nadeem.kashan.flyweight.Block.TipMaterial;

public class TestConstructor {

	@Test
	public void rightTest() {
		Block b = new Block(TipMaterial.apa, 3);
		assertEquals(TipMaterial.apa, b.getMaterial());
		assertEquals(3, b.getLatura());
	}
	
	@Test
	public void existanceTest() {
		Block b = new Block(TipMaterial.sticla, 5);
		assertNotNull("object", b);
		assertNotNull("material", b.getMaterial());
		assertNotNull("latura", b.getLatura());
	}

}
