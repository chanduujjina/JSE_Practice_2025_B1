package com.demo.exception.handler.revice;

import java.io.IOException;

public class ConstrctorExceptionDemo2 {

	public static void main(String[] args) {
		Base base = new Derieved();
	}
}

class Base1 {
	
	Base1() throws IOException
	{
		System.out.println("inside base contructor");
	}
	
}

class Derieved1 extends Base1 {
	Derieved1() throws Exception
	{
		//super();
		System.out.println("inside Derieved contructor");
		
	}
}
