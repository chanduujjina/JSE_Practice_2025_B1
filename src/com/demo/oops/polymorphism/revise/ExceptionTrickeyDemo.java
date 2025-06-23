package com.demo.oops.polymorphism.revise;

public class ExceptionTrickeyDemo {

}

class Parent {
	public void m1() throws Exception{
		
	}
}

class Child extends Parent {
    public void m1() throws ArithmeticException {
		
	}
}
