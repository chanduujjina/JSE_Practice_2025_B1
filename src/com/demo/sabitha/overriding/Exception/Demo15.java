package com.demo.sabitha.overriding.Exception;
public class Demo15 {
	
public static void main(String[] args){
		
		Devied9 devied1=new Devied9();
		devied1.m1();
}
}
class Base9{
	void m1(){
		System.out.println("Base");
	}
	
}
class Devied9 extends Base9{
	@Override
	void m1()throws RuntimeException {
		System.out.println("Child");
		
	}
	
	
}
