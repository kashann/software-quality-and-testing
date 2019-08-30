package Strategy;

public class MenuOffer {
	private String name;
	private int noCalories;
	private int noCarbs;
	
	public MenuOffer(String name, int noCalories, int noCarbs) {
		super();
		this.name = name;
		this.noCalories = noCalories;
		this.noCarbs = noCarbs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoCalories() {
		return noCalories;
	}

	public void setNoCalories(int noCalories) {
		this.noCalories = noCalories;
	}

	public int getNoCarbs() {
		return noCarbs;
	}

	public void setNoCarbs(int noCarbs) {
		this.noCarbs = noCarbs;
	}

	@Override
	public String toString() {
		return "MenuOffer [name=" + name + ", noCalories=" + noCalories + ", noCarbs=" + noCarbs + "]";
	}
}
