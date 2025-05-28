package com.demo.stringhandler;

public class DobDemo {
	
	public static void main(String[] args) {
		
		String dob = "04/17/03";
		
		//Regex to match MM/DD/YY format
		
		String Regex = "^(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])/\\d{2}$";
		
	     if (dob.matches(Regex)) {
	    	 
	    	System.out.println("dob is valid");
	 }
		
		
	}
}
	
	