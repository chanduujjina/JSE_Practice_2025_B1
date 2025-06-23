package com.demo.constructor.exception;

import java.io.IOException;

public class Demo5 {
	public static void main(String[] args) throws Exception  {
		Child4 child= new Child4();
		
	}

}
class Parent4{
	public Parent4() throws IOException{
		
		System.out.println("parent");
	}
	
}
class Child4 extends Parent4{
	public Child4() throws Exception{
		System.out.println("child");
	}
}