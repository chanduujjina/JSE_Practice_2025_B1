package com.demo.sabitha.overriding.Exception;
public class Demo4 {
	public static void main(String[] args) {
		
		Base2 devied1=new Devied2();
		devied1.m1();
			}
	

}
class Base2{
	void m1()throws NumberFormatException{
		System.out.println("Base");
	}
	
}
class Devied2 extends Base2{
	@Override
	void m1()throws IllegalArgumentException {
		
		System.out.println("Devired");
	}
	
}
