package com.demo.sabitha.overriding.Exception;
public class Demo6 {
	
public static void main(String[] args) {
		
		Devied4 devied1=new Devied4();
		devied1.m1();
			}
	

}
class Base4{
	void m1()throws RuntimeException{
		System.out.println("Base");
	}
	
}
class Devied4 extends Base3{
	@Override
	void m1()throws NullPointerException{
		System.out.println("Child");
		
	}
	
	
}
