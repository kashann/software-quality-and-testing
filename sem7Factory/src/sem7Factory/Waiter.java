package sem7Factory;

public class Waiter extends AEmployee{

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Waiter";
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("The waiter " + this.getName() + " is printed.");
	}

}
