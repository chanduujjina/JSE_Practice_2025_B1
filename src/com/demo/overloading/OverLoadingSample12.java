package com.demo.overloading;

public class OverLoadingSample12 {
	public static void main(String[] args) {
		
		new OverLoadingSample12().m1(6, 12);
		
		
	}

	public  void m1(Integer a, Long b) {
		System.out.println("int,long");
		
	}
	public void m1(int ...a) {
		System.out.println("Var args");
		
	}
	
		
	
}
