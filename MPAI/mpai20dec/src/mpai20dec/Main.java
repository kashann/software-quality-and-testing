package mpai20dec;

public class Main {
	public static void main(String[] args) {
		DataMapper dm = new DataMapper();
		AngajatRepository repo = new AngajatRepository(dm);
		Angajat ionica = new Angajat("Ionica", 1234);
		Angajat dorel = new Angajat("Dorel", 2300);
		//repo.add(dorel);
		//repo.remove(ionica);
		//repo.get(Query.get("nume", "like", "'Ion%'"));
		//repo.get(Query.get("salariu", "<=", 1234));
		repo.getAll();
		
	}

}
