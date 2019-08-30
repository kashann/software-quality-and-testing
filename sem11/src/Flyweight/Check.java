package Flyweight;

public class Check implements IPrintable{
	//containing the shared part
	private String text;
	
	public Check(String text) {
		super();
		this.text = text;
	}

	@Override
	public void print(ClientCheckInfo clientInfo) {
		System.out.println(clientInfo.getClientName() + " you have to pay " + clientInfo.getCost() + text);
	}	
}
