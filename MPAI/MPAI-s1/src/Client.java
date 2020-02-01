import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

public class Client {
	private int cod;
	private String denumire;
	private String adresa;
	private TIP_CLIENT tipClient;
	
	public Client() {
		
	}
	
	public Client(int cod, String denumire, String adresa) {
		this.cod = cod;
		this.denumire = denumire;
		this.adresa = adresa;
		this.tipClient = TIP_CLIENT.NONE;
	}
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getDenumire() {
		return denumire;
	}
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}	
	public TIP_CLIENT getTipClient() {
		return tipClient;
	}

	public void setTipClient(TIP_CLIENT tipClient) {
		this.tipClient = tipClient;
	}

	public void afiseaza() {
		System.out.println("Clientul (" + this.cod + ") " + this.denumire + " are adresa " + this.adresa + ".");
	}
	
	public void salveaza() {
		List<String> lines = Arrays.asList(this.cod+"", this.denumire, this.adresa);
		Path file = Paths.get(this.cod + ".txt");
		try {
			Files.write(file, lines, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void restaureaza(String fileName) {
		Path file = Paths.get(fileName);
		try {
			List<String> lines = Files.readAllLines(file);
			this.cod = Integer.parseInt(lines.get(0));
			this.denumire = lines.get(1);
			this.adresa = lines.get(2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public double getDiscount() {
		switch(this.getTipClient()) {
			case NONE:
				return 0;
			case BRONZE:
				return 5;
			case SILVER:
				return 10;
			case GOLD:
				return 15;
			case PLATINUM:
				return 20;
		}
		return 0;
	}
}
