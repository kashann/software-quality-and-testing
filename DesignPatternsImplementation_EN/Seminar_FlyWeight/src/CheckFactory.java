import java.util.HashMap;


public class CheckFactory {
	private HashMap<String, Check> checks = new HashMap<>();
	
	public Check getCheck(String format) {
		Check check = checks.get(format);
		if (check == null) {
			check = new Check(format);
			checks.put(format, check);
		}
		return check;
	}
	
	public int getNoCheck() {
		return checks.size();
	}
}
