package com.demo.methodoverloading;

public class Bas14 {
	
	public static void main(String[] args) {
		
		m1(10,10);
		
		
		
		
	}
	
	static void m1(int a, Long b)
	{
		System.out.println("Callin int int");
	}
	static void m1(int...a)
	{
		System.out.println("Calling vargs fixednumber of arguments ");
	}

}
