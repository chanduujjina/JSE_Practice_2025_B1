package com.demo.methodoverloading;

public class Bas13 {
	
	public static void main(String[] args) {
		
		m1(10,10);
		
		
		
		
	}
	
	static void m1(Long a, Long b)
	{
		System.out.println("Callin Long Long");
	}
	static void m1(int...a)
	{
		System.out.println("Calling vargs fixedvalue ");
	}

}
