package com.demo.oops.polymorphism.revise;

public class OverLoadAmbiguityDemo4 {
	
	public static void main(String[] args) {
		OverLoadAmbiguityDemo4 demo1 = new OverLoadAmbiguityDemo4();
		
		demo1.m1(1,1);
	}

	  
	  
	  void m1(int va11, int val2) {//Exact match
			System.out.println("2");
			
	  }
	  
	  void m1(Integer a, Integer b) {//Auto Boxing
			System.out.println("1");
			
		  }
     
}
