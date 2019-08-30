package Structurale.Composite;

import java.util.ArrayList;

public class Structura extends ANod{ //composite
	ArrayList<ANod> elementeStructura = new ArrayList();
	String numeStruct;
	String descriere;
	
	public Structura(String nume, String descriere) {
		this.numeStruct = nume;
		this.descriere = descriere;
	}

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getSalariu() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getInfo() {
		StringBuffer sb = new StringBuffer();
		sb.append(numeStruct + " - " + this.descriere);
		sb.append("\n");

		for(ANod nod : elementeStructura) {
			sb.append("\t" + nod.getInfo());
		}
		
		return sb.toString();
	}

	@Override
	public void adaugaNodCopil(ANod elementStructura) {
		elementeStructura.add(elementStructura);
	}

	@Override
	public void stergeNodCopil(ANod elementStructura) {
		elementeStructura.remove(elementStructura);
	}

	@Override
	public ANod getNodCopil(int i) {
		return (ANod)elementeStructura.get(i);
	}
}
