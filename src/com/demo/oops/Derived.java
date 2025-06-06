package com.demo.oops;

public class Derived extends Base{
	
	public void m2() {
		System.out.println("inside Derived class m2 method");
	}
	
	public void m3() {
		System.out.println("inside child class m3 method");
		super.m3();
	}

}
