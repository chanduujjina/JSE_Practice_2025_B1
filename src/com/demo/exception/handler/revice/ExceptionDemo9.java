package com.demo.exception.handler.revice;

public class ExceptionDemo9 {
	
	public static void main(String[] args) {
		
		try {
			int result = 10/0;
			System.out.println(result);
			
		}
		
		catch(Exception ex) {
			System.out.println("exception");
			System.exit(0);
		}
		
		finally {
			System.out.println("finally");
		}
	}

}
