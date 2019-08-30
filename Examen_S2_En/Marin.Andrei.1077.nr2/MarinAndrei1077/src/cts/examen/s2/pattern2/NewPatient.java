package cts.examen.s2.pattern2;

public class NewPatient {
	
	String name;
	boolean isBleeding;
	boolean isUnconscious;
	float bodyTemp;
	
	
	public NewPatient(String name, boolean isBleeding, boolean isUnconscious, float bodyTemp) {
		super();
		this.name = name;
		this.isBleeding = isBleeding;
		this.isUnconscious = isUnconscious;
		this.bodyTemp = bodyTemp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isBleeding() {
		return isBleeding;
	}
	public void setBleeding(boolean isBleeding) {
		this.isBleeding = isBleeding;
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
		this.bodyTemp = bodyTemp;
	}
	
	public String getDescription(){
		String msg = String.format("My name is {0}, I have a temp of {1}",name,bodyTemp);
		if(isBleeding)
			msg += " and I am bleeding";
		return msg;
	}
}
