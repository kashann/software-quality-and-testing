
public class EmployeeFactory {
	public static AEmployee createEmployee(EEmployeeType type,
			String name) {
		AEmployee employee = null;
		if(type == EEmployeeType.COOK) {
			employee = new Cook();
			employee.setName(name);
		}
		else if(type == EEmployeeType.WAITER) {
			employee = new Waiter();
			employee.setName(name);
		}
		
		return employee;
	}
}
