package com.demo.oops;

public class Base1 {
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	private String type;

	public Base1(String type) {
		super();
		this.type = type;
	}

	
	public void m1() {
		System.out.println("inside Base1 m1()");
	}
}
