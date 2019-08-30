package s08.g1077.nadeem.kashan.flyweight;

import java.util.ArrayList;
import java.util.HashMap;

import s08.g1077.nadeem.kashan.flyweight.Block.TipMaterial;

public class BlockFlyweightFactory {	
	private ArrayList<HashMap<Integer, Block>> blocks = new ArrayList<HashMap<Integer, Block>>();
	//private HashMap<TipMaterial, HashMap<Integer, Block>> blocks = new HashMap<TipMaterial, HashMap<Integer, Block>>();
	//i chose to implement an array of hashmaps instead of hashmap of hashmaps because there is a limited number of types of materials
	//and for the sake of simplicity
	
	public BlockFlyweightFactory() {
		for(int i = 0; i < 5; i++) {
			blocks.add(new HashMap<Integer, Block>());
		}
	}
	
	public Block getBlock(TipMaterial tip, int latura) {
		int tipNr = 0;
		switch(tip) {
		case lemn:
			tipNr = 1;
			break;
		case piatra:
			tipNr = 2;
			break;
		case sticla:
			tipNr = 3;
			break;
		case nisip:
			tipNr = 4;
			break;
		case apa:
			tipNr = 5;
			break;
		}
		Block block = blocks.get(tipNr - 1).get(latura);
		if(block == null) {
			block = new Block(tip, latura);
			blocks.get(tipNr).put(latura, block);			
		}
		return block;
	}
	
	public int getNoBlocks() {
		int c = 0;
		for(int i = 0; i < 5; i++) {
			c += blocks.get(i).size();
		}
		return c;
	}
}
