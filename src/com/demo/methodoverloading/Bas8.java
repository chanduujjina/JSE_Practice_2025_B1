package com.demo.methodoverloading;

public class Bas8 {
	
	public static void main(String[] args) {
		
		m1(10,10);
		
		
		
		
	}
	
	static void m1(Integer a, Long b)
	{
		System.out.println("Callin Integr Long");
	}
	static void m1(Integer a,Integer b)
	{
		System.out.println("Calling Integr Integer ");
	}

}
