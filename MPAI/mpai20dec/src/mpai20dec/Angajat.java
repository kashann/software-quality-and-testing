package mpai20dec;

public class Angajat {
	public int id;
	public String name;
	public int salary;
	
	public Angajat() {
		super();
	}
	
	public Angajat(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public Angajat(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	@Override
	public String toString() {
		return "Angajat [name=" + name + ", salary=" + salary + "]";
	}
}
