package com.demo.oops.polymorphism;

public class OverLoadHandler2 {
	
  
	public void m1(int val1,String val2) {
		System.out.println("inside m1 signature int,string");
	}
	
	

	
    public void m1(String val1,int val2) {
    	System.out.println("inside m1 signature string,int");
	}
    
     public int m1(String val1,int val2,String val3) {
		return Integer.parseInt(val1);
	}
     
     public static void main(String[] args) {
    	 OverLoadHandler2 handler2 = new OverLoadHandler2();
    	 
    	 handler2.m1(1,"test");
    	 
    	 handler2.m1("test",10);
    	 
    	 int val = handler2.m1("1",10,"test");
    	 
    	 System.out.println("inside m1 string int String "+val);
	}
}
