package com.demo.methodoverloading;

public class Bas12 {
	
	public static void main(String[] args) {
		
		m1(10,10);
		
		
		
		
	}
	
	static void m1(Integer a, Integer b)
	{
		System.out.println("Callin Integer Integer");
	}
	static void m1(int...a)
	{
		System.out.println("Calling args fixed number ");
	}

}
