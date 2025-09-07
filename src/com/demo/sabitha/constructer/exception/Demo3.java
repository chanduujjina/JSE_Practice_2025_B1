package com.demo.sabitha.constructer.exception;

import java.io.IOException;

public class Demo3 {
	public static void main(String[] args) throws IOException  {
			Child2 child=new Child2();
	}

}
class Parent2{
	public Parent2()throws RuntimeException{
		System.out.println("parent");
		
	}
}
class Child2 extends Parent2{
	public Child2()throws IOException{
		System.out.println("child");
		
	}
	
}
