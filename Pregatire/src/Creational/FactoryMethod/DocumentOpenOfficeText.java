package Creational.FactoryMethod;

public class DocumentOpenOfficeText extends ADocument{

	@Override
	public String getTip() {
		return "Document OpenOffice de tip text";
	}

	@Override
	public void print(String text) {
		System.out.println(text);
	}

}
