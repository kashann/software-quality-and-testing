package Creational.FactoryMethod;

public class OpenOfficeDocumentFactory extends ADocumentFactory{

	@Override
	protected ADocument createDocument(ETipDocument tip) {
		ADocument doc = null;
		switch(tip){
		case TEXT:
			doc = new DocumentOpenOfficeText();
			break;
		case HTML:
			doc = new DocumentHtml();
			break;
		}
		return doc;
	}

}
