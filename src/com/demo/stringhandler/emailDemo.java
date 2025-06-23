package com.demo.stringhandler;

public class emailDemo {
	
	public static void main(String[] args) {
		
	String input = "charancherry9833@gmail.com";
	
	String Regex = "^[a-zA-Z0-9+_.-]+@[A-za-z0-9.-]+$";
	
	 if (input.matches(Regex)) {
		 
		 System.out.println("Emial is valid");
	 }
		
		
	}
}
	
	