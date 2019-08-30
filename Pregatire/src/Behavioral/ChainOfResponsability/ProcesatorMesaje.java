package Behavioral.ChainOfResponsability;

public class ProcesatorMesaje extends Handler{

	@Override
	public void manageRequest(Mesaj mesaj) {
		if(mesaj.getProritate() <= 50)
			System.out.println("Mesaj: " + mesaj.getText());
		else {
			System.out.println("passing further...(1)");
			if(this.successor != null)
				this.successor.manageRequest(mesaj);
		}
	}
}
