package com.demo.methodoverloading;

public class Bas5 {
	
	public static void main(String[] args) {
		
		m1(10,10);
		
		
		
		
	}
	
	static void m1(Long a, Long b)
	{
		System.out.println("Callin Long  long");
	}
	static void m1(Integer a,Integer b)
	{
		System.out.println("Calling vargs ");
	}

}
