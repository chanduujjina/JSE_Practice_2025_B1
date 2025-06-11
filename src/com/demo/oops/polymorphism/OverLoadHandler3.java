package com.demo.oops.polymorphism;

public class OverLoadHandler3 {
	
  
	public void m1(int val1,int val2) {
		
	}

	
    public void m1(String val1,int val2) {
		
	}
    
     public int m1(String val1,int val2,String val3) {
		return Integer.parseInt(val1);
	}
}
