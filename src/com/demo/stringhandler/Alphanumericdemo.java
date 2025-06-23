package com.demo.stringhandler;

public class Alphanumericdemo {
	
	
	public static void main(String[] args) {
		
		String input = "sudha123";
		
		String Regex = "^[a-zA-Z0-9]+$";
		
		if (input.matches(Regex)) {
			
			System.out.println("AlphaNumeric.String");
		}
		
	}
}
	
	