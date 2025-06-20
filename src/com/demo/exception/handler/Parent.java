package com.demo.exception.handler;

public class Parent {

	public void m1() throws RuntimeException {
		System.out.println("inside m1() Parent");
	}
}

class Child extends Parent {
	
	@Override
	public void m1() throws IndexOutOfBoundsException{
		System.out.println("inside m1() child");
	}
}
