package Creational.FactoryMethod;

public class DocumentWordText extends ADocument{

	@Override
	public String getTip() {
		return "Document MSWord de tip text";
	}

	@Override
	public void print(String text) {
		System.out.println(text);
	}

}
