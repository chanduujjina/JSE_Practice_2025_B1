package com.demo.overloading;

public class OverLoadingSample1 {
	public static void main(String[] args) {
		
		new OverLoadingSample1().m1(6, 12);
		
		
	}

	public  void m1(int i, int j) {
		System.out.println("int,int");
		
	}
	public void m1(long i, int j) {
		System.out.println("long,int");
		
	}
	
		
	
}
