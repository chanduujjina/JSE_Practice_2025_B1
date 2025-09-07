package com.demo.sabitha.constructer.exception;

import java.io.FileNotFoundException;

public class Demo9{
	public static void main(String[] args) throws FileNotFoundException{
			Child5 child=new Child5();
	}

}
class Parent5{
	public Parent5()throws IndexOutOfBoundsException {
		System.out.println("parent");
		
	}
}
class Child5 extends Parent5{
	public Child5()throws FileNotFoundException{
		System.out.println("child");
		
	}
	
}
