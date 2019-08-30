
public class CommandPasta implements ICommand{
	private String pastaType;
	private boolean isHot;
	
	private Cook cook;
	
	
	public CommandPasta(String pastaType, boolean isHot, Cook cook) {
		super();
		this.pastaType = pastaType;
		this.isHot = isHot;
		this.cook = cook;
	}


	@Override
	public void cook() {
		cook.cookPasta(pastaType, isHot);
	}

}
