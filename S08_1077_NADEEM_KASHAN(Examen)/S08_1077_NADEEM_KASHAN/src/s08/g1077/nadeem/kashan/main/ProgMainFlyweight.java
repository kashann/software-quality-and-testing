package s08.g1077.nadeem.kashan.main;

import s08.g1077.nadeem.kashan.flyweight.BlockFlyweightFactory;
import s08.g1077.nadeem.kashan.flyweight.Block.TipMaterial;

public class ProgMainFlyweight {	
	
	public static void useBlock(int quantity, TipMaterial tip, int latura, BlockFlyweightFactory factory) {
		for(int i = 0; i < quantity; i++) {
			factory.getBlock(tip, latura).build();
		}
	}

	public static void main(String[] args) {
		BlockFlyweightFactory factory = new BlockFlyweightFactory();
		
		useBlock(20, TipMaterial.piatra, 5, factory);
		useBlock(30, TipMaterial.lemn, 3, factory);
		
		System.out.println(factory.getNoBlocks() + " blocks created");
	}

}
