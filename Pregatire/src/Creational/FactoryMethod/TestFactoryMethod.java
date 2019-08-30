package Creational.FactoryMethod;

public class TestFactoryMethod {

	public static void main(String[] args) {
		ADocumentFactory wordFactory = new WordDocumentFactory();
		
		ADocument doc1 = wordFactory.newDocument(ETipDocument.TEXT, "Factory.txt");
		ADocument doc2 = wordFactory.newDocument(ETipDocument.HTML, "Factory.html");
		
		System.out.println(doc1.getTip());
		doc1.print("word doc1");
		System.out.println(doc2.getTip());
		doc2.print("word doc2");
		
		ADocumentFactory openOfficeFactory = new OpenOfficeDocumentFactory();
		
		ADocument doc3 = openOfficeFactory.newDocument(ETipDocument.TEXT, "Factory.txt");
		ADocument doc4 = openOfficeFactory.newDocument(ETipDocument.HTML, "Factory.html");
		
		System.out.println(doc3.getTip());
		doc3.print("word doc3");
		System.out.println(doc4.getTip());
		doc4.print("word doc4");
	}

}
