package com.demo.constructor.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo13 {
	public static void main(String[] args) throws Exception  {
		Child13 child= new Child13();
		
	}

}
class Parent13{
	public Parent13() {
		
		System.out.println("parent");
	}
	
}
class Child13 extends Parent13{
	public Child13() throws IOException{
		System.out.println("child");
	}
}