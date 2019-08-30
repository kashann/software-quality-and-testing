package IG.Factory;

import IG.Singleton.Banca;

public class ContDebit implements IContBancar {

	private double sold;
	private int codCont;
	
	@Override
	public void transfer(IContBancar destinatie, double suma) {
		//+verificari
		destinatie.depune(suma);
		this.sold-=suma;
	}

	@Override
	public void depune(double suma) {
		this.sold+=suma;
	}

	public ContDebit() throws Exception {
		super();
		this.codCont=Banca.getInstance().getCodNou();
		this.sold=100;
	}

	@Override
	public String toString() {
		return "ContDebit [sold=" + sold + ", codCont=" + codCont + "]";
	}

	@Override
	public void retragere(double suma) {
		this.sold-=suma;
	}
	
}
