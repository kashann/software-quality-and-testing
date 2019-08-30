package Behavioral.Memento;

public class TestMemento {
	public static void main(String[] args) {
		StringBuilder cod = new StringBuilder();
		cod.append("void main()\n");
		cod.append("getFromServer()\n");		
		
		Project licenta = new Project(cod, "Restaurant");
		GitHubCareTaker github = new GitHubCareTaker();
		github.commit(licenta.save());
		
		licenta.addFunction("saveDatabase()\n");
		github.commit(licenta.save());
		
		licenta.addFunction("sendOrder()\n");
		//github.commit(licenta.save());
		
		System.out.println(licenta.getCode());
		licenta.undo(github.pull());
		System.out.println(licenta.getCode());
		licenta.undo(github.pull());
		System.out.println(licenta.getCode());
	}
}
