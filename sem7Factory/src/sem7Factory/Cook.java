package sem7Factory;

public class Cook extends AEmployee{

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Cook";
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("The cook " + this.getName() + " is printed.");
	}

}
