
public class Waiter extends AEmployee{

	@Override
	public String getType() {
		return "Waiter";
	}

	@Override
	public void print() {
		System.out.println("The waiter "+ this.getName()+
				" is printed");
	}

}
