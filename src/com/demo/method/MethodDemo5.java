package com.demo.method;

//pascal case
public class MethodDemo5 {
	
	
	//main method is 
	//1.void method
	//2.static method
	//3.name  of method main
	
	public static void main(String[] args) {
		m1(1,2,3,4,5,6);
	}
	
	public static void m1(int ... valarray) {
		
		for(int val :valarray) {
			System.out.println(val);
		}
	}
	
	
	

}
