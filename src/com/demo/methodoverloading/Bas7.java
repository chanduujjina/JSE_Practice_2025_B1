package com.demo.methodoverloading;

public class Bas7 {
	
	public static void main(String[] args) {
		
		m1(10,10);
		
		
		
		
	}
	
	static void m1(Integer a, long b)
	{
		System.out.println("Callin Integr long");
	}
	static void m1(Integer a,Integer b)
	{
		System.out.println("Calling Integer Integer ");
	}

}
