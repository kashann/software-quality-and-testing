
public class Check implements IPrintable{
	private String format;
	
	public Check(String format) {
		this.format = format;
	}

	@Override
	public void printCheck(ClientCheckInfo clientInfo) {
		System.out.println(clientInfo.getClientName() + " you have to pay! " + format);
	}

	public String getFormat() {
		return format;
	}
	
}
