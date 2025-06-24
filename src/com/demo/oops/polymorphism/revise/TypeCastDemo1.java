package com.demo.oops.polymorphism.revise;

public class TypeCastDemo1 {
	
	public static void main(String[] args) {
		
		int a = 10;
		
		long b = a; //up casting-> Widening -> Implicit
		
		float c = 10.5f;
		
		int d = (int)c; //->Explicit downcasting
		
		System.out.println(d);
	}

}
