package com.demo.overloading;

public class OverLoadingSample15 {
	public static void main(String[] args) {
		
		new OverLoadingSample15().m1();
		
		
	}

	public  void m1(int  a, int b) {
		System.out.println("Integer,Integer");
		
	}
	public void m1(int ...a) {
		System.out.println("Var args");
		
	}
	
		
	
}
