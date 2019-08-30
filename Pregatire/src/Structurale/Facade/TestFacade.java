package Structurale.Facade;

public abstract class TestFacade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fereastra f = new Fereastra();
		MasinaSpalat m = new MasinaSpalat();
		
		ApartamentFacade apt = new ApartamentFacade(f, m);
		apt.inchideCasa();
		apt.pornesteCasa();
		apt.inchideCasa();
	}

}
