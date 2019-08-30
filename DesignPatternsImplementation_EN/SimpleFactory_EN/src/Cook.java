
public class Cook extends AEmployee{

	@Override
	public String getType() {
		return "Cook";
	}

	@Override
	public void print() {
		System.out.println("The cook "+ this.getName()+
				" is printed");
	}

}
