package Flyweight;

import java.util.HashMap;

public class CheckFactory {
	private HashMap<String, Check> checkFormatMap = new HashMap<>();
	
	public Check getCheckFormat(String format) {
		Check check = checkFormatMap.get(format);
		if(check == null) {
			check = new Check(format);
			checkFormatMap.put(format,  check);
		}
		return check;
	}
	
	public int getNoFormatCheck() {
		return checkFormatMap.size();
	}
}
