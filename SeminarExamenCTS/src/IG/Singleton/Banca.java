package IG.Singleton;

import IG.Factory.ContCredit;
import IG.Factory.ContDebit;
import IG.Factory.ETipCard;
import IG.Factory.IContBancar;

public class Banca {
    private static Banca instance=null;
    private String numeBanca="BancaASE";
    private String adresa="Dorobanti, 13";
    private int nrCont=0;
    
    private Banca() throws Exception {
    	if(instance != null)
    	    throw new Exception("Obiect deja creat");
    }
    
    public static Banca getInstance() throws Exception {
    	if(instance==null) {
    		instance=new Banca();
    	}
    	return instance;
    }
    
    //metoda pentru generare coduri unice
    public int getCodNou() {
    	return ++nrCont;
    }
    //metoda din fabrica de obiecte(simple factory)
    public IContBancar generareCont(ETipCard tip) throws Exception {
    	IContBancar contBancar=null;
    	if(ETipCard.CREDIT==tip) {
    		contBancar = new ContCredit();
    	}
    	else if(ETipCard.DEBIT==tip) {
    		contBancar=new ContDebit();
    	}
    	return contBancar;
    }
}
