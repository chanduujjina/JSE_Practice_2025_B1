package com.demo.sabitha.oops;

public class Wheel {
	private String wheeltype;
	private String wheelname;
	public Wheel(String wheeltype,String wheelname) {
		this.wheeltype=wheeltype;
		this.wheelname=wheeltype;
	}
	@Override
	public String toString() {
		return "Wheel [wheeltype=" + wheeltype + ", wheelname=" + wheelname + "]";
	}
	
}
