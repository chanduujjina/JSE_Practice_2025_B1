package com.demo.constructor.exception;

import java.io.IOException;

public class Demo4 {
	public static void main(String[] args) throws IOException  {
		Child3 child= new Child3();
		
	}

}
class Parent3{
	public Parent3() throws RuntimeException{
		
		System.out.println("parent");
	}
	
}
class Child3 extends Parent3{
	public Child3() throws IOException{
		System.out.println("child");
	}
}