package IG.Factory;

import IG.Singleton.Banca;

public class ContCredit implements IContBancar{

	private double sold;
	private int codCont;
	private double dobanda;
	@Override
	public void transfer(IContBancar destinatie, double suma) {
		destinatie.depune(suma);
		this.sold-=suma;
	}

	@Override
	public void depune(double suma) {
		this.sold+=suma;
	}
	
	public ContCredit() throws Exception {
		super();
		this.codCont=Banca.getInstance().getCodNou();
		this.sold=0;
	}

	@Override
	public String toString() {
		return "ContCredit [sold=" + sold + ", codCont=" + codCont + ", dobanda=" + dobanda + "]";
	}

	@Override
	public void retragere(double suma) {
		this.sold-=suma;
	}

}
