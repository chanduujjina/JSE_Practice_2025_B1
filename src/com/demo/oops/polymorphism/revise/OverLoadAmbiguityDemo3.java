package com.demo.oops.polymorphism.revise;

public class OverLoadAmbiguityDemo3 {
	
	public static void main(String[] args) {
		OverLoadAmbiguityDemo3 demo1 = new OverLoadAmbiguityDemo3();
		
		demo1.m1(1,1);
		//demo1.m1();
		//demo1.m1(1);
		//demo1.m1(1,2,3);
	}

	  
	  
	/*
	 * void m1(long va11, int val2) { System.out.println("2");
	 * 
	 * }
	 */
	  
	  void m1(Integer a,Integer b) {
		  System.out.println("3");
	  }
	  
	  void m1(int ... a) {//optinal
			System.out.println("1");
			
		  }
     
}
