package Behavioral.ChainOfResponsability;

public class ProcesatorMesajePrioritate extends Handler{

	@Override
	public void manageRequest(Mesaj mesaj) {
		if(mesaj.getProritate() > 50 && mesaj.getProritate() <= 100)
			System.out.println("Mesaj cu prioritate: " + mesaj.getText());
		else {
			System.out.println("passing further...(2)");
			if(this.successor != null)
				this.successor.manageRequest(mesaj);
		}
	}

}
