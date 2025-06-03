package com.demo.stringhandler;

public class StringDemo9 {
	
	public static void main(String[] args) {
		
		
		validateAadharNumber("234567891231");//  request 1
		
		validateAadharNumber("2345678912311");//  request 2
		
		validateAadharNumber("1345678912311");//  request 2
		
	}

	private static void validateAadharNumber(String inputNumber) {
		String aadharRegex = "^[2-9][0-9]{11}$";
		boolean matches = inputNumber.matches(aadharRegex);
		
		System.out.println(matches);
		
	}
}
