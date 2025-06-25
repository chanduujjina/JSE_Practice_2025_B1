package com.demo.overloading;

public class OverLoadingSample16 {
	public static void main(String[] args) {
		
		new OverLoadingSample16().m1(2,4,6,8,9);
		
		
	}

	public  void m1(int  a, int b) {
		System.out.println("Integer,Integer");
		
	}
	public void m1(int ...a) {
		System.out.println("Var args");
		
	}
	
		
	
}
