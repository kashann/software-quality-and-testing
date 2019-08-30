package cts.examen.s2.pattern1;

public class Patient {
	String name;
	boolean isBleeding;
	boolean isUnconscious;
	float bodyTemp;
	public Patient(String name, boolean isBleeding, boolean isUnconscious, float bodyTemp) {
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
	
}
