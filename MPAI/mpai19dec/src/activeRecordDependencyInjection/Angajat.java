package activeRecordDependencyInjection;

public class Angajat {
	public int id;
	public String name;
	public int salary;
	public Database db;
	
	public Angajat() {
		super();
	}
	
	public Angajat(String name, int salary, Database db) {
		super();
		this.name = name;
		this.salary = salary;
		this.db = db;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void insert() {
		db.insert(this);
	}
	
	public void update() {
		db.update(this);
	}
	
	public void delete() {
		db.delete(this.id);
	}

	@Override
	public String toString() {
		return "Angajat [name=" + name + ", salary=" + salary + "]";
	}
}
