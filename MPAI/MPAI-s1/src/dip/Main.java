package dip;

public class Main {

	public static void main(String[] args) {
		Radio radio = new Radio();
		TV tv = new TV();

		Comutator comRad = new Comutator(radio);
		Comutator comTv = new Comutator(tv);
		comRad.aparat.porneste();
		comRad.aparat.opreste();
		comTv.aparat.porneste();
		comTv.aparat.opreste();
	}

}
