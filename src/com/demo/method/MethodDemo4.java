package com.demo.method;

//pascal case
public class MethodDemo4 {
	
	
	//main method is 
	//1.void method
	//2.static method
	//3.name  of method main
	
	public static void main(String[] args) {
		m1(1);//first request
		m1(1,2);
		
		m2(1,2f);
		
		
		m2(4,8f,"test");
	}
	
	public static void m1(int ... valarray) {
		
		for(int val :valarray) {
			System.out.println(val);
		}
	}
	
	public static void m2(int a,float b,String ... val) {
		System.out.println("a::"+a);
		System.out.println("b:"+b);
		
		for (String result : val) {
			System.out.println(result);
		}
	}
	
	
	

}
