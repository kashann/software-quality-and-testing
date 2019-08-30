package Creational.Builder;

public class ContBancarBuilder implements IBuilder{
	private ContBancar cont;
	
	public ContBancarBuilder() {
		cont = new ContBancar();
	}
	
	public ContBancarBuilder setDetinator(String detinator) {
		cont.setDetinator(detinator);
		return this;
	}
	
	public ContBancarBuilder setSumaBlocata(double suma) {
		cont.setSumaBlocata(suma);
		return this;
	}
	
	public ContBancarBuilder setSuma(double suma) {
		cont.setSuma(suma);
		return this;
	}
	
	public ContBancarBuilder setMoneda(String moneda) {
		cont.setMoneda(moneda);
		return this;
	}
	
	public ContBancarBuilder setCardAtasat(boolean card) {
		cont.setCardAtasat(card);
		return this;
	}
	
	public ContBancarBuilder setContSalariu(boolean contSalariu) {
		cont.setContSalariu(contSalariu);
		return this;
	}

	@Override
	public ContBancar build() {
		return cont;
	}

}
