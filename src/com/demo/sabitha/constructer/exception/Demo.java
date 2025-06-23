package com.demo.sabitha.constructer.exception;
public class Demo {
	public static void main(String[] args)  {
		try {
			Child child=new Child();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
class Parent{
	public Parent()throws ArithmeticException {
		System.out.println("parent");
		
	}
}
class Child extends Parent{
	public Child()throws Exception{
		System.out.println("child");
		
	}
	
}
