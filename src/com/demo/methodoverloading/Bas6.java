package com.demo.methodoverloading;

public class Bas6 {
	
	public static void main(String[] args) {
		
		m1(10,10);
		
		
		
		
	}
	
	static void m1(long a, int b)
	{
		System.out.println("Callin iny long");
	}
	static void m1(Integer a,Integer b)
	{
		System.out.println("Calling Integer Integer ");
	}

}
