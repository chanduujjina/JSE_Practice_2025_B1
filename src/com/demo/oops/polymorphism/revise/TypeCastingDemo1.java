package com.demo.oops.polymorphism.revise;

public class TypeCastingDemo1 {
	
	public static void main(String[] args) {
		
		
		int a = 10;
		
		long b = a;//UpCasting or widening
		
		
		long c = 20;
		
		int d = (int)c;//Downcasting or narrowing
		
		System.out.println("---------------");
		
		float f = 10.5f;
		
		int g = (int)f;
		System.out.println(g);
	}

}
