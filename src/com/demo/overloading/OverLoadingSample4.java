package com.demo.overloading;

public class OverLoadingSample4 {
	public static void main(String[] args) {
		
		new OverLoadingSample4().m1(6, 12);
		
		
	}

	public  void m1(Integer i, long j) {
		System.out.println("int,int");
		
	}
	public void m1(long i, int j) {
		System.out.println("long,int");
		
	}
	
		
	
}
