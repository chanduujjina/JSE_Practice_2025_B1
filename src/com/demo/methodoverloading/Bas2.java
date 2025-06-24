package com.demo.methodoverloading;

public class Bas2 {
	
	public static void main(String[] args) {
		
		m1(10,10);
		
		
		
		
	}
	
	static void m1(byte a, int b)
	{
		System.out.println("Callin int int");
	}
	static void m1(int a,int b)
	{
		System.out.println("Calling int int ");
	}

}
