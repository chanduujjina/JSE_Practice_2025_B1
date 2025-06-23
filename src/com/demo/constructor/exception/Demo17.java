package com.demo.constructor.exception;

import java.io.FileNotFoundException;
import java.io.IOException;


public class Demo17 {
	public static void main(String[] args) throws Exception  {
		Child15 child= new Child15();
		
	}

}
class Parent15{
	public Parent15() throws ArithmeticException{
		
		System.out.println("parent");
	}
	
}
class Child15 extends Parent15{
	public Child15()throws IOException{
		System.out.println("child");
	}
}