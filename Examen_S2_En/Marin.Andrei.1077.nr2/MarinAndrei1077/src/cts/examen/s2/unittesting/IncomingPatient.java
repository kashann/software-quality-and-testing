package cts.examen.s2.unittesting;

public class IncomingPatient {
	String name;
	boolean isUnconscious;
	float bodyTemp;
	public IncomingPatient(String name, boolean isUnconscious, float bodyTemp) throws PatientException {
		super();
		if(bodyTemp>40 || bodyTemp<32) {
			throw new PatientException();
		}else {
		this.name = name;
		this.isUnconscious = isUnconscious;
		this.bodyTemp = bodyTemp;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isUnconscious() {
		return isUnconscious;
	}
	
	public void setUnconscious(boolean isUnconscious) {
		this.isUnconscious = isUnconscious;
	}
	
	public float getBodyTemp() {
		return bodyTemp;
	}
	
	public void setBodyTemp(float bodyTemp) throws PatientException {
		if(bodyTemp>40 || bodyTemp<32) {
			throw new PatientException();
		}else {
		this.bodyTemp = bodyTemp;
		}
	}
	
	public float minDrugPrice(float[] prices) throws DrugException{
		
		if(prices==null) {
			throw new DrugException();
		}
		int size=0;
		for(float price:prices) {
			size++;
		}
		if(size==0) {
			throw new DrugException();
		}
		float min = prices[0];
		for(float price : prices) {
			if(min > price) {
				min = price;
			}
		}
		return min;
	}
	
}
