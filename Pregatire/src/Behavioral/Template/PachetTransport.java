package Behavioral.Template;

public class PachetTransport extends PachetTuristic{

	public PachetTransport(int codPachet) {
		super(codPachet);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cautareCazare(int codPachet) {
		
	}

	@Override
	public void cautareTransport(int codPachet) {
		System.out.println("S-a gasit transport (" + codPachet + ")");
	}

	@Override
	public void rezervaPachet(int codPachet) {
		System.out.println("S-a rezervat pachetul (" + codPachet + ")");
	}

	@Override
	public void platirePachet(int codPachet) {
		System.out.println("S-a platit pachetul (" + codPachet + ")");
	}
	
}
