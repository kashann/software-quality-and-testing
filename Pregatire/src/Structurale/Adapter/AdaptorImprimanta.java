package Structurale.Adapter;

public class AdaptorImprimanta extends ImprimantaMatriciala implements InterfataImprimantaLaser{
	//concrete adapter
	@Override
	public void laserPrint(String[] paragrafe) {
		// TODO Auto-generated method stub
		this.print(paragraf2Text(paragrafe));
	}

	@Override
	public void cancelPrint() {
		// TODO Auto-generated method stub
		this.cancel();
	}
	
	public String paragraf2Text(String[] paragrafe) {
		StringBuilder sb = new StringBuilder();
		for(String paragraf : paragrafe)
			sb.append(" " + paragraf);
		return sb.toString();
	}

}
