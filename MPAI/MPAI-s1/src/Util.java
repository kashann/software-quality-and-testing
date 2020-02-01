import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

public class Util {
	public static void salveaza(Client2 client) {
		List<String> lines = Arrays.asList(client.getCod()+"", client.getDenumire(), client.getAdresa());
		Path file = Paths.get(client.getCod() + ".txt");
		try {
			Files.write(file, lines, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Client2 restaureaza(String fileName) {
		Path file = Paths.get(fileName);
		try {
			List<String> lines = Files.readAllLines(file);
			ClientBronze client = new ClientBronze(Integer.parseInt(lines.get(0)), lines.get(1), lines.get(2));
			return client;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
