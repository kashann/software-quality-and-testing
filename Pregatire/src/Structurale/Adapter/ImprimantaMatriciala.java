package Structurale.Adapter;

public class ImprimantaMatriciala implements InterfataImprimantaMatriciala{
	//client
	private String idImprimanta;

	@Override
	public void print(String text) {
		// TODO Auto-generated method stub
		System.out.println("Imprimanta: Printing ..." + text);
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		System.out.println("Imprimanta: CANCEL print");
	}

}
