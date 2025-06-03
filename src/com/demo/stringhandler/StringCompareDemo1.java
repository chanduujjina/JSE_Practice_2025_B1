package com.demo.stringhandler;

public class StringCompareDemo1 {
	
	public static void main(String[] args) {
		String name1 ="TEST";
		
		String name2 = "test";
		
		String upperCase = name2.toUpperCase();
		
		System.out.println(upperCase);
		
		boolean isequals = name1.equals(name2.toUpperCase());
		
		System.out.println(isequals);
	}

}
