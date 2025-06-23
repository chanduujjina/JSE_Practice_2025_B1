package com.demo.sabitha.overriding.Exception;

import java.io.IOException;

public class Demo7 {
	
public static void main(String[] args) {
		
		Devied5 devied1=new Devied5();
		devied1.m1();
			}
	

}
class Base5{
	void m1()throws IOException{
		System.out.println("Base");
	}
	
}
class Devied5 extends Base5{
	@Override
	void m1(){
		System.out.println("Child");
		
	}
	
	
}
