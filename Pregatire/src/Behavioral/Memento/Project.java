package Behavioral.Memento;

public class Project { //originator
	private StringBuilder sourceCode;
	private String name;
	
	public Project(StringBuilder sourceCodes, String name) {
		super();
		this.sourceCode = sourceCodes;
		this.name = name;
	}
	
	public void addFunction(String function) {
		sourceCode.append(function);
	}
	
	public SourceCodeMemento save() {
		System.out.println("Saving function");
		return new SourceCodeMemento(this.sourceCode.toString());
	}
	
	public void undo(SourceCodeMemento memento) {
		this.sourceCode = new StringBuilder();
		this.sourceCode.append(memento.getSavedCode());
	}
	
	public String getCode() {
		return this.sourceCode.toString();
	}
}
