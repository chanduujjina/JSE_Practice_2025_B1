package com.demo.methodoverloading;

public class Bas4 {
	
	public static void main(String[] args) {
		
		m1(10,10);
		
		
		
		
	}
	
	static void m1(int a, long b)
	{
		System.out.println("Callin int long");
	}
	static void m1(long a,int b)
	{
		System.out.println("Calling int int ");
	}

}
