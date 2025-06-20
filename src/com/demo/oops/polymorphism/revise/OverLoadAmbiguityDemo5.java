package com.demo.oops.polymorphism.revise;

public class OverLoadAmbiguityDemo5 {
	
	public static void main(String[] args) {
		OverLoadAmbiguityDemo5 demo1 = new OverLoadAmbiguityDemo5();
		
		demo1.m1(1, 1);
		
	}

	  
	  
	  void m1(int va11, int val2) {
			System.out.println("2");
			
	  }
	  
	  void m1(long va11, long val2) {
			System.out.println("1");
			
		  }

}
