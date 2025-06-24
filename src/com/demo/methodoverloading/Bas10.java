package com.demo.methodoverloading;

public class Bas10 {
	
	public static void main(String[] args) {
		
		m1(10,10);
		
		
		
		
	}
	
	static void m1(long a, int b)
	{
		System.out.println("Callin long int");
	}
	static void m1(int...a)
	{
		System.out.println("Calling args ");
	}

}
