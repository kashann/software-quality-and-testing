package Behavioral.ChainOfResponsability;

public class ProcesartorMesajePrioritateMaxima extends Handler{

	@Override
	public void manageRequest(Mesaj mesaj) {
		if (mesaj.getProritate() > 100){
			System.out.println("Mesaj cu prioritate maxima: " + mesaj.getText());
		}
		else{
			System.out.println("passing further...(3)");
			if(this.successor != null)
				this.successor.manageRequest(mesaj);
		}
	}

}
