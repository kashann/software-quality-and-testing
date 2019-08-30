package cts.examen.s2.unittesting;

public class IncomingPatient {
	String name;
	boolean isUnconscious;
	float bodyTemp;
	public IncomingPatient(String name, boolean isUnconscious, float bodyTemp) {
		super();
		this.name = "test";
		this.isUnconscious = isUnconscious;
		bodyTemp = bodyTemp;
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
	
	public void setBodyTemp(float bodyTemp) {
		bodyTemp = 0;
	}
	
	public float minDrugPrice(float[] prices){
		float min = 1000;
		
		for(float price : prices)
			if(min > price)
				min = price;
		
		return min;
	}
	
}
