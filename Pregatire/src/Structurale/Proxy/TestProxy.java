package Structurale.Proxy;

public class TestProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfataImagine img1 = new Imagine("first.jpg");
		img1.afisareImagine();
		System.out.println();
		
		InterfataImagine proxy = new ProxyImagine("second.png");
		proxy.afisareImagine();
	}

}
