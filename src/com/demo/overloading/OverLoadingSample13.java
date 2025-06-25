package com.demo.overloading;

public class OverLoadingSample13 {
	public static void main(String[] args) {
		
		new OverLoadingSample13().m1(6, 12);
		
		
	}

	public  void m1(Integer a, Integer b) {
		System.out.println("Integer,Integer");
		
	}
	public void m1(int ...a) {
		System.out.println("Var args");
		
	}
	
		
	
}
