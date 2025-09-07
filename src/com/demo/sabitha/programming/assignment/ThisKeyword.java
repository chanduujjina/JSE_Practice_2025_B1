package com.demo.sabitha.programming.assignment;

public class ThisKeyword {
	private String str;
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public void m1(String str) {
		System.out.println("current class object "+this.str);
		System.out.println("method data "+str);
	}
	public ThisKeyword(String str) {
		this.str=str;
	}

}

