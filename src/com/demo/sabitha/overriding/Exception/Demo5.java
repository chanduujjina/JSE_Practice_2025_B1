package com.demo.sabitha.overriding.Exception;
public class Demo5 {
public static void main(String[] args) {
		
		Devied3 devied1=new Devied3();
		devied1.m1();
			}
	

}
class Base3{
	void m1()throws NullPointerException{
		System.out.println("Base");
	}
	
}
class Devied3 extends Base3{
	@Override
	void m1()throws RuntimeException{
		System.out.println("Child");
		
	}
}
