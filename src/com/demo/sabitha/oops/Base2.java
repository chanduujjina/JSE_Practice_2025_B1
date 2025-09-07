package com.demo.sabitha.oops;

public class Base2 {
	public int x=10;
	public static int x1=10;
	public String gettype() {
		return type;
	}
	private String type;
	public void settype(String type) {
		this.type=type;
	}
	public Base2(String type) {
		this.type=type;
	}
	public void print() {
		System.out.println("print method");
	}
}
