package Creational.FactoryMethod;

public class DocumentHtml extends ADocument{

	@Override
	public String getTip() {
		return "Document HTML";
	}

	@Override
	public void print(String text) {
		System.out.println("<p>" + text + "</p>");
	}

}
