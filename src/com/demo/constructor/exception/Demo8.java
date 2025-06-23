package com.demo.constructor.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo8 {
	public static void main(String[] args) throws Exception  {
		Child7 child= new Child7();
		
	}

}
class Parent7{
	public Parent7() throws ArithmeticException{
		
		System.out.println("parent");
	}
	
}
class Child7 extends Parent7{
	public Child7() throws RuntimeException{
		System.out.println("child");
	}
}