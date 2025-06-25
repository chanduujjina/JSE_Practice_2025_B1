package com.demo.overloading;

public class OverLoadingSample14 {
	public static void main(String[] args) {
		
		new OverLoadingSample14().m1(6, 12);
		
		
	}

	public  void m1(Long  a, Long b) {
		System.out.println("Integer,Integer");
		
	}
	public void m1(int ...a) {
		System.out.println("Var args");
		
	}
	
		
	
}
