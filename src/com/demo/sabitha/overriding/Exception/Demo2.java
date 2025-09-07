package com.demo.sabitha.overriding.Exception;
public class Demo2 {
	public static void main(String[] args) {
		Base devied=new Devied();
		devied.m1();
		}
	

}
class Base{
	void m1()throws IndexOutOfBoundsException {
		System.out.println("base");
	}
	
}
class Devied extends Base{
	@Override
	void m1()throws ArrayIndexOutOfBoundsException {
		System.out.println("childe");
		
	}
	
}
