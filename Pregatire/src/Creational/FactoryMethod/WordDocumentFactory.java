package Creational.FactoryMethod;

public class WordDocumentFactory extends ADocumentFactory{

	@Override
	protected ADocument createDocument(ETipDocument tip) {
		ADocument doc = null;
		
		switch(tip) {
		case TEXT:
			doc = new DocumentWordText();
			break;
		case HTML:
			doc = new DocumentHtml();
			break;
		}
		return doc;
	}

}
