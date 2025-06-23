package com.demo.overridding.exception;

public class Demo2 {
	public static void main(String[] args) {
	Base1 derived1= new Derived1();
		derived1.m1();
		
		
	}
	

}
class Base1 {
    void m1()throws ArrayIndexOutOfBoundsException {
    	
    	}
	   
   }
	


class Derived1 extends Base1{
	@Override
	void m1()throws IndexOutOfBoundsException {
		System.out.println("sample1");
		
	
		
	}
}