package com.demo.exception.handler.revice;

public class ConstrctorExceptionDemo1 {

	public static void main(String[] args) {
		Base base = new Derieved();
	}
}

class Base {
	
	Base() throws RuntimeException
	{
		System.out.println("inside base contructor");
	}
	
}

class Derieved extends Base {
	Derieved() throws ArithmeticException
	{
		//super();
		System.out.println("inside Derieved contructor");
		
	}
}
