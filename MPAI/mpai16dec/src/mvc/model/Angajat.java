package mvc.model;

public class Angajat extends AObservable {
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
		this.update();
	}
	
	public void update() {
		this.notifyAllObservers(this);
	}
}
