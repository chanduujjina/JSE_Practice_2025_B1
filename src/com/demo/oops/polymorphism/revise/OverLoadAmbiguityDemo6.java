package com.demo.oops.polymorphism.revise;

public class OverLoadAmbiguityDemo6 {
	
	public static void main(String[] args) {
		OverLoadAmbiguityDemo6 demo1 = new OverLoadAmbiguityDemo6();
		
		demo1.m1();
		
	}

	  
	  
	  void m1(int va11, int val2) {
			System.out.println("2");
			
	  }
	  
	 void m1(int ... a) {
		 System.out.println("3");
	 }

}
