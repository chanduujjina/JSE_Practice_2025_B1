package com.demo.method;

public class PassByValueDemo1 {
	
	public static void main(String[] args) {
		Integer val = new Integer(1);
		
	    m1(val);
	    
	    System.out.println(val);
	}

	private static void m1(Integer val) {
		val = null;
		
		System.out.println(val);
		
	}

}