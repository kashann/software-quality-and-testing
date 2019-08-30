package Creational.FactoryMethod;

public abstract class ADocumentFactory {
	protected abstract ADocument createDocument(ETipDocument tip);
	
	public ADocument newDocument(ETipDocument tip, String titlu) {
		ADocument doc = createDocument(tip);
		
		if(doc != null)
			doc.setTitlu(titlu);
		
		return doc;
	}
}
