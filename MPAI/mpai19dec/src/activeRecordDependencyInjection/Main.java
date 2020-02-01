package activeRecordDependencyInjection;

public class Main {

	public static void main(String[] args) {
		Database bd = new Database();
		Angajat angajat = new Angajat("Ionel Pop", 1234, bd);
		angajat.insert();
		bd.display();
		angajat.setSalary(6789);
		angajat.update();
		bd.display();
		angajat.delete();
		bd.display();
	}

}
