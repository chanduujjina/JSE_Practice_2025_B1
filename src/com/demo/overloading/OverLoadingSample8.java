package com.demo.overloading;

public class OverLoadingSample8 {
	public static void main(String[] args) {
		
		new OverLoadingSample8().m1(6, 12);
		
		
	}

	public  void m1(Integer i, Integer j) {
		System.out.println("Integer,Integer");
		
	}
	public void m1(Long i, long j) {
		System.out.println("Integer,long");
		
	}
	
		
	
}
