package com.demo.methodoverloading;

public class Bas9 {
	
	public static void main(String[] args) {
		
		m1(10,10);
		
		
		
		
	}
	
	static void m1(Long a, Integer b)
	{
		System.out.println("Callin short int");
	}
	static void m1(Integer a,Long b)
	{
		System.out.println("Calling int long ");
	}

}
