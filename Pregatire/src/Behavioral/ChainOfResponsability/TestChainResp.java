package Behavioral.ChainOfResponsability;

public class TestChainResp {

	public static void main(String[] args) {
		Mesaj m1 = new Mesaj(10, "mesaj1");
		Mesaj m2 = new Mesaj(60, "mesaj2");
		Mesaj m3 = new Mesaj(120, "mesaj3");
		
		Handler h1 = new ProcesatorMesaje();
		Handler h2 = new ProcesatorMesajePrioritate();
		Handler h3 = new ProcesartorMesajePrioritateMaxima();
		
		h2.setSuccessor(h1);
		h1.setSuccessor(h3);
		
		System.out.println("\nMesaj1:");
		h2.manageRequest(m1);
		System.out.println("\nMesaj2:");
		h2.manageRequest(m2);
		System.out.println("\nMesaj3:");
		h2.manageRequest(m3);
	}

}
