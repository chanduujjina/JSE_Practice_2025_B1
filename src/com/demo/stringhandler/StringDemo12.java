package com.demo.stringhandler;

public class StringDemo12 {
	
	public static void main(String[] args) {
		
		String name = "Chandu";
		
		//AEWPU4902R
		
		validatePanNumber("AEWPU4902R");//request 1
		
		//validatePanNumber("AEWPUA4902R");
		
		
	}

	private static void validatePanNumber(String inputNumber) {
		String panReqex = "^[A-Z]{5}[0-9]{4}[A-Z]$";
		
		boolean matches = inputNumber.matches(panReqex);
		
		if (!matches) {
			throw new RuntimeException("Invalid Pan number");
		}
		else {
			System.out.println("valid pan Number");
		}
	}
}
