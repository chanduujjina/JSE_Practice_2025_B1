package com.demo.stringhandler;

public class RegexNumberDemo2 {
	
	public static void main(String[] args) {
		
		//9676010868
		
     String phoneNumberRegex = "^[5-9][0-9]{9}$";
     
     String inputNumber = "9676010868";
     
     boolean matches = inputNumber.matches(phoneNumberRegex);
     
     
     System.out.println(matches);
		
		
	}
}
	
	