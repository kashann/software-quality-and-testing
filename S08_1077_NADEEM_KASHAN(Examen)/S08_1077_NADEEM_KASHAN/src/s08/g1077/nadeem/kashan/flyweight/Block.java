package s08.g1077.nadeem.kashan.flyweight;

import s08.g1077.nadeem.kashan.unittesting.MaterialException;

public class Block implements BuildableBlock{
	public enum TipMaterial { lemn, piatra, sticla, nisip, apa };
	private TipMaterial material;
	private int latura;
	//pozitia blocului intr-un spatiu 3D
	private int x;
	private int y;
	private int z;
	
	public Block(TipMaterial material, int latura) {
		if(material != null)
			this.material = material;
		if(latura <= 10 && latura >= 0)
			this.latura = latura;
	}
	
	public TipMaterial getMaterial() {
		return material;
	}
	public void setMaterial(TipMaterial material) throws MaterialException {
		if(material != null)
			this.material = material;
		else
			throw new MaterialException();
	}
	public int getLatura() {
		return latura;
	}
	public void setLatura(int latura) {
		if(latura <= 10 && latura >= 0)
			this.latura = latura;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public void build() {
		System.out.println("A " + material + " block (" + latura + "m) was added to the construction");
	}
}
