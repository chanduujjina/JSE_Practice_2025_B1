package com.demo.overloading;

public class OverLoadingSample7 {
	public static void main(String[] args) {
		
		new OverLoadingSample7().m1(6, 12);
		
		
	}

	public  void m1(Integer i, Integer j) {
		System.out.println("Integer,Integer");
		
	}
	public void m1(long i, long j) {
		System.out.println("long,long");
		
	}
	
		
	
}
