package nullObjectDesignPattern;

import iteratorDesignPattern.Client;
import iteratorDesignPattern.Iterator;
import iteratorDesignPattern.ListaClienti;

public class Main {

	public static void main(String[] args) {
		//nullobject
		Discount silver = new Silver();
		Comanda comandaSilver = new Comanda(silver, "prod1, prod2, prod3", 100);
		System.out.println(comandaSilver.calculeazaDiscount());
		
		//iterator
		Client c1 = new Client(101, "Client1", "Adr1");
		Client c2 = new Client(102, "Client2", "Adr2");
		Client c3 = new Client(103, "Client3", "Adr3");
		Client[] clienti = {c1, c2, c3};
		
		ListaClienti listaClienti = new ListaClienti(clienti);
		Iterator<Client> iterator = listaClienti.getIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
		
		while(iterator.hasPrev()) {
			System.out.println(iterator.prev().toString());
		}
		
		//mediator
	}

}
