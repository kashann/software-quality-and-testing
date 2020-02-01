package l;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

public class Fisier implements Flux {

	@Override
	public void deschide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void citeste(String location) {
		Path file = Paths.get(location);
		try {
			List<String> lines = Files.readAllLines(file);
			System.out.println(lines.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void scrie(String text, String location) {
		List<String> lines = Arrays.asList(text);
		Path file = Paths.get(location + ".txt");
		try {
			Files.write(file, lines, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void include() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seek() {
		// TODO Auto-generated method stub
		
	}

}
