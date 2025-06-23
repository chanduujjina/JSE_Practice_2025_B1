package com.demo.overridding.exception;

public class Demo1 {
	public static void main(String[] args)throws Exception  {
		Child child= new Child();
		child.m1();
		
	}
	

}
class Parent {
    void m1() throws Exception {
    	System.out.println("Base");
    				
    	}
	   
   }
	


class Child extends Parent{
	@Override
	
	void m1 ()throws ArithmeticException {
		System.out.println("sample");
		
	
		
	}
}