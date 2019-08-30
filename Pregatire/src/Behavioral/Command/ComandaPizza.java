package Behavioral.Command;

public class ComandaPizza implements ComandaBucatarie{
	private Bucatar bucatar;
	private String tip;

	@Override
	public void gateste() {
		bucatar.preparePizza(this.tip);
	}
	
	public ComandaPizza(Bucatar bucatar, String tip) {
		this.bucatar = bucatar;
		this.tip = tip;
	}

}
