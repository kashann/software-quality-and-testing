package IG.main;

import IG.Adapter.AdapterB2B;
import IG.Adapter.IBankAccount;
import IG.Factory.ETipCard;
import IG.Factory.IContBancar;
import IG.Singleton.Banca;

public class testare {

	public static void main(String[] args) throws Exception {
		//Singleton
		Banca banca= Banca.getInstance();
		Banca banca1=Banca.getInstance();
		
		if(banca1==banca) {
			System.out.println("Referinte identice");
		}
		
		//testare simple factory
		IContBancar cont1 = banca.generareCont(ETipCard.CREDIT);
		IContBancar cont2 = banca.generareCont(ETipCard.CREDIT);
		IContBancar cont3 = banca1.generareCont(ETipCard.DEBIT);
		
		cont3.transfer(cont1, 30);
		
		System.out.println(cont1);
		System.out.println(cont3);
		
		cont2.depune(200);
		System.out.println(cont2);
		
		//testare Adapter
		//Banca RO
		cont1.transfer(cont2, 20);
		
		//Banca EN
		IBankAccount contAdaptor=new AdapterB2B();
		IBankAccount contAdaptor2=new AdapterB2B();
		contAdaptor.accountTransfer(contAdaptor2, 100);
		
	}
}
