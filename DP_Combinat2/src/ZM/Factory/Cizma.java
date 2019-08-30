package ZM.Factory;
import ZM.Singleton.MagazinOnline;


public class Cizma extends APantof{
	
	@Override
	public String getInfo() {
		return "Cizma marime: "+this.marime;
	}

	@Override
	public double calculMateriePrima() {
		return this.marime * MagazinOnline.getInstance().getMpCizma();
	}

}
