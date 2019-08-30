package ZM.Singleton;
import ZM.Factory.APantof;
import ZM.Factory.EPantof;
import ZM.Factory.PantofFactory;
import ZM.State.IStare;
import ZM.State.StareAcceptata;
import ZM.State.StareDefault;
import ZM.State.StareRefuzata;


public class Comanda {
	private int codComanda;
	private APantof pantof;
	private String culoare;
	private IStare stareComanda;
	
	public Comanda(EPantof tipPantof, int marime, String culoare) {
		this.codComanda = MagazinOnline.getInstance().getCodComanda();
		this.pantof = PantofFactory.crearePantof(tipPantof, marime);
		this.culoare = culoare;
		this.stareComanda = new StareDefault();
	}
	
	public void getInfoComanda(){
		this.stareComanda.getInfoComanda();
	}
	
	public APantof getPantof() {
		return pantof;
	}
	
	public void setStareComanda(IStare stareComanda) {
		this.stareComanda = stareComanda;
	}
	
	@Override
	public String toString() {
		return "Comanda [codComanda=" + codComanda + ", pantof=" + pantof.getInfo()
				+ ", culoare=" + culoare + ", stareComanda=" + stareComanda
				+ "]";
	}
}
