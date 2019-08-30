package Creational.Factory;

public class TestFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DocumentFactory factory = new DocumentFactory();
		
		ADocument doc1 = factory.createDocument(ETipDocument.TEXT, "Factory.txt");
		ADocument doc2 = factory.createDocument(ETipDocument.HTML, "Factory.html");
		
		System.out.println(doc1.getTip());
		doc1.print("Text1");
		System.out.println(doc2.getTip());
		doc2.print("Text2");
	}

}
