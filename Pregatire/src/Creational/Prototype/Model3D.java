package Creational.Prototype;

import java.util.ArrayList;

public abstract class Model3D implements Cloneable{ //prototype
	private String id;
	protected ArrayList<Object> poligoane;
	protected String tip;
	
	abstract void draw();
	
	public Model3D() {
		try {
			System.out.println("Working...");
			Thread.currentThread().sleep(1500);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String getType() {
		return tip;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public ArrayList<Object> getVertices(){
		return this.poligoane;
	}

	@Override
	protected Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

	@Override
	public String toString() {
		return "Model 3D " + this.tip + " cu id " + this.id;
	}
	
	
}
