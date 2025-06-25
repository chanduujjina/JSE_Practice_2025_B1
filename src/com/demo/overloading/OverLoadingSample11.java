package com.demo.overloading;

public class OverLoadingSample11 {
	public static void main(String[] args) {
		
		new OverLoadingSample11().m1(6, 12);
		
		
	}

	public  void m1(int a, long b) {
		System.out.println("int,long");
		
	}
	public void m1(int ...a) {
		System.out.println("Var args");
		
	}
	
		
	
}
