package Creational.Factory;

public class DocumentHtml extends ADocument{ //concrete product

	public DocumentHtml(String titlu) {
		this.setTitlu(titlu);
	}
	
	@Override
	public String getTip() {
		return "Document HTML";
	}

	@Override
	public void print(String text) {
		System.out.println("<p>" + text + "</p>");
	}

}
