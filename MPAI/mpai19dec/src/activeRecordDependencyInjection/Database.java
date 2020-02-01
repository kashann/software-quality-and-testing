package activeRecordDependencyInjection;

import java.util.HashMap;

public class Database {
	private HashMap<Integer, Angajat> bd = new HashMap<Integer, Angajat>();
	private int lastId = 0;
	
	public Database() {
		Angajat ang1 = new Angajat("John Doe", 2000, this);
		Angajat ang2 = new Angajat("Ionut Adanc", 3000, this);
		Angajat ang3 = new Angajat("Nicolae Cusca", 4000, this);
		Angajat ang4 = new Angajat("Brad Paine", 5000, this);
		insert(ang1);
		insert(ang2);
		insert(ang3);
		insert(ang4);
	}

	public void display() {
		for(int i = 0; i < bd.size(); i++) {
			System.out.println(bd.get(i).toString());
		}
		System.out.println();
	}
	
	public void insert(Angajat angajat) {
		angajat.setId(lastId);
		bd.put(lastId, angajat);		
		lastId++;
	}
	
	public void update(Angajat angajat) {
		bd.put(angajat.getId(), angajat);
	}
	
	public void delete(int id) {
		bd.remove(id);
	}
}
