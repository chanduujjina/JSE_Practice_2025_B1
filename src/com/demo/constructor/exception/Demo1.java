package com.demo.constructor.exception;

public class Demo1 {
	public static void main(String[] args) throws Exception {
		Child child= new Child();
		
	}

}
class Parent{
	public Parent() throws ArithmeticException{
		
		System.out.println("parent");
	}
	
}
class Child extends Parent{
	public Child() throws Exception{
		System.out.println("child");
	}
}