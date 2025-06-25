package com.demo.overloading;

public class OverLoadingSample10 {
	public static void main(String[] args) {
		
		new OverLoadingSample10().m1(6, 12);
		
		
	}

	public  void m1(int a, Long b) {
		System.out.println("int,long");
		
	}
	public void m1(int ...a) {
		System.out.println("Var args");
		
	}
	
		
	
}
