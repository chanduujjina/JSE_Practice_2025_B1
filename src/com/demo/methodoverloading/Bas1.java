package com.demo.methodoverloading;

public class Bas1 {
	
	public static void main(String[] args) {
		
		m1(10,10);
		
		
		
		
	}
	
	static void m1(short a, int b)
	{
		System.out.println("Callin short int");
	}
	static void m1(int a,long b)
	{
		System.out.println("Calling int long ");
	}

}
