package com.demo.OOPSpractice;

public class ExceptionHandler {
	public static void main(String[] args) {
		int age = 19;
		String val = "";
		try {
			val = validateAge(age);
			
		}
		catch(Exception ex) {
			val = ex.getMessage();
			
		}
		System.out.println(val);
			
		
	}

	private static String validateAge(int age) throws Exception {
		if(age < 18) {
			throw new Exception("Error age must be grater than 18"); 
		}
		else {
			return "Sucess";
		}
	}

}
