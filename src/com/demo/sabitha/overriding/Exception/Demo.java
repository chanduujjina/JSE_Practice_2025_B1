package com.demo.sabitha.overriding.Exception;
public class Demo {
	public static void main(String[] args) throws Exception{
		Parents child=new Child();
		child.m1();
	}
	

}
class Parents{
	void m1()throws Exception {
		System.out.println("Base");
	}
	
}
class Child extends Parents{
	@Override
	void m1()throws ArithmeticException{
		System.out.println("child");
		
	}
	
}
