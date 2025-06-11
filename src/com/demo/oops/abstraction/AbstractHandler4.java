package com.demo.oops.abstraction;

public class AbstractHandler4 {
	
	public static void main(String[] args) {
		Base2 base = new Derived();
		base.m1();
		base.m2();
	}

}

interface Base1 {
	void m1();
}

interface Base2 extends Base1{
	String type ="Parent Type";//public static final
	void m2();
}

class Derived implements Base2 {

	@Override
	public void m1() {
		System.out.println("Inside Derived m1 method");
		
	}

	@Override
	public void m2() {
		System.out.println("Inside Derived m2 method");
		
	}
	
}
