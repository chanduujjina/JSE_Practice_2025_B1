package com.demo.stringhandler;

public class StringDemo10 {
	
	public static void main(String[] args) {
		
		String name = "Chandu";
		//start quote" -> ^
		// endquote " -> $
		
		boolean matches = name.matches("^[a-zA-Z]+$");
		
		System.out.println(matches);
		
		//9959336745
		
		validatePhoneNumber("9073532532");//request 1
		
		validatePhoneNumber("5573532532");//request 1
		
	}

	private static void validatePhoneNumber(String inputNumber) {
		String phoneNumberReqgex = "^[6-9][0-9]{9}$";
		
		boolean matches2 = inputNumber.matches(phoneNumberReqgex);
		
		System.out.println(matches2);
	}
}
