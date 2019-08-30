package Creational.Factory;

public class DocumentFactory { //factory
	public static ADocument createDocument(ETipDocument tip, String titlu) {
		ADocument doc = null;
		switch(tip) {
		case TEXT:
			doc = new DocumentText();
			doc.setTitlu(titlu);
			break;
		case HTML:
			doc = new DocumentHtml(titlu);
			break;
		}
		return doc;
				
	}
}
