package com.demo.sabitha.constructer.exception;


public class Demo7{
	public static void main(String[] args){
			Child4 child=new Child4();
	}

}
class Parent4{
	public Parent4()throws RuntimeException{
		System.out.println("parent");
		
	}
}
class Child4 extends Parent4{
	public Child4()throws IndexOutOfBoundsException {
		System.out.println("child");
	}
	
	
}
