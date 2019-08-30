package Behavioral.Memento;

import java.util.ArrayList;
import java.util.List;

public class GitHubCareTaker {
	private List<SourceCodeMemento> versions = new ArrayList<SourceCodeMemento>();
	
	public void commit(SourceCodeMemento memento) {
		this.versions.add(memento);
	}
	
	public SourceCodeMemento pull() {
		if(versions.size() != 0) {
			SourceCodeMemento code = versions.get(versions.size() - 1);
			versions.remove(versions.size() - 1);
			return code;
		}
		else return new SourceCodeMemento("");
	}
}
