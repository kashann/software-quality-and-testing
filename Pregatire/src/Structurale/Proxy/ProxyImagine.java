package Structurale.Proxy;

public class ProxyImagine implements InterfataImagine{ //proxy

	private Imagine imagineReala = null;
	private String fisier = null;
	
	public ProxyImagine(final String fisier) {
		this.fisier = fisier;
	}
	
	@Override
	public void afisareImagine() {
		if(DoWeHaveMemory(this.fisier)) {
			if(imagineReala == null)
				imagineReala = new Imagine(fisier);			
		}
		imagineReala.afisareImagine();
	}
	
	boolean DoWeHaveMemory(String fileName) {
		System.out.println("Memory check...");
		return true;
	}

}
