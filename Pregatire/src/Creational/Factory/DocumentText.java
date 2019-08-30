package Creational.Factory;

public class DocumentText extends ADocument{

	@Override
	public String getTip() {
		return "Text";
	}

	@Override
	public void print(String text) {
		System.out.println("Text: " + text);
	}

}
