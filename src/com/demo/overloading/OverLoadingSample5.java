package com.demo.overloading;

public class OverLoadingSample5 {
	public static void main(String[] args) {
		
		new OverLoadingSample5().m1(6, 12);
		
		
	}

	public  void m1(Integer i, long j) {
		System.out.println("long,long");
		
	}
	public void m1(long i, long j) {
		System.out.println("long,long");
		
	}
	
		
	
}
