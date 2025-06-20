package com.demo.oops;

public class Wheel {
	
	private String wheelType;
	
	private String wheelName;

	public Wheel(String wheelType, String wheelName) {
		super();
		this.wheelType = wheelType;
		this.wheelName = wheelName;
	}

	@Override
	public String toString() {
		return "Wheel [wheelType=" + wheelType + ", wheelName=" + wheelName + "]";
	}

}
