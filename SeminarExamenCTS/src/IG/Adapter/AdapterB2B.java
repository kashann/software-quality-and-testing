package IG.Adapter;

import IG.Factory.IContBancar;
import IG.Singleton.Banca;

public class AdapterB2B implements IBankAccount{

	private IContBancar cont;

	@Override
	public void accountTransfer(IBankAccount account, double amount) {
		account.deposit(amount);
		cont.retragere(amount);
	}

	@Override
	public void deposit(double amount) {
		cont.depune(amount);
	}

}
