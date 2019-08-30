package Behavioral.Memento;

public class SourceCodeMemento {
	private final String code;
	
	public SourceCodeMemento(String code) {
		this.code = code;
	}
	
	public String getSavedCode() {
		return code;
	}
}
