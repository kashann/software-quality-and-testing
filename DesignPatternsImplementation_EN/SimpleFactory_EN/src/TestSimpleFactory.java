
public class TestSimpleFactory {

	public static void main(String[] args) {
		AEmployee waiter1 = EmployeeFactory.createEmployee(
				EEmployeeType.WAITER, "Name 1");
		AEmployee waiter2 = EmployeeFactory.createEmployee(
				EEmployeeType.WAITER, "Name 2");
		
		AEmployee cook1 = EmployeeFactory.createEmployee(
				EEmployeeType.COOK, "Name 3");
		
		System.out.println(waiter1.getType());
		System.out.println(waiter2.getType());
		System.out.println(cook1.getType());
		
		waiter1.print();
		waiter2.print();
		cook1.print();
	}

}
