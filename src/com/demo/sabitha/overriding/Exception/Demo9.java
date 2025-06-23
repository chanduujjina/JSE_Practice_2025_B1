package com.demo.sabitha.overriding.Exception;

import java.io.IOException;

public class Demo9 {
	
public static void main(String[] args){
		
		Devied7 devied1=new Devied7();
		devied1.m1();
		}
	

}
class Base7{
	void m1()throws IOException{
		System.out.println("Base");
	}
	
}
class Devied7 extends Base7{
	@Override
	void m1()throws RuntimeException{
		System.out.println("Child");
		
	}
	
	
}
