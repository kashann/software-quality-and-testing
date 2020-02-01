package mpai20dec;

public class Query {
	
	public static String get(String field, String condition, Object value) {
		return " where (" + field + " " + condition + " " + value + ")";
	}
}
