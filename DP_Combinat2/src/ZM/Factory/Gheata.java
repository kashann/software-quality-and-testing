package ZM.Factory;
import ZM.Singleton.MagazinOnline;


public class Gheata extends APantof{

	@Override
	public String getInfo() {
		return "Gheata marime: "+this.marime;
	}

	@Override
	public double calculMateriePrima() {
		return this.marime * MagazinOnline.getInstance().getMpGheata();
	}

}
