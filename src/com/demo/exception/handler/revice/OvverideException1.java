package com.demo.exception.handler.revice;

public class OvverideException1 {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.m1();
	}
}

class Parent {
	void m1() throws RuntimeException
	{
		
	}
}

class Child extends Parent{
   void m1() throws ArithmeticException
   {
		
	}
}
