package Behavioral.Command;

public class ComandaSupa implements ComandaBucatarie{
	private Bucatar bucatar;
	private String tip;

	@Override
	public void gateste() {
		this.bucatar.prepareSoup(this.tip);
	}
	
	public ComandaSupa(Bucatar bucatar, String tip) {
		this.bucatar = bucatar;
		this.tip = tip;
	}

}
