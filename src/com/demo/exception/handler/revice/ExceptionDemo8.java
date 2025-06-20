package com.demo.exception.handler.revice;

public class ExceptionDemo8 {
	
	public static void main(String[] args) {
		
		try {
			int result = 10/0;
			System.out.println(result);
			System.exit(0);
		}
		
		catch(Exception ex) {
			System.out.println("exception");
		}
		
		finally {
			System.out.println("finally");
		}
	}

}
