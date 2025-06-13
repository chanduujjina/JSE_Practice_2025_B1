package com.demo.exception.handler;

public class RTHandlerDemo6 {
	
	
	public static void main(String[] args) {
		
		//request1
		m1(10,5);
		
	
	}

	private static void m1(int num1,int num2) {
		try {
			
			System.out.println("inside try block");
			int result  = num1/num2;
			System.exit(0);
			
		}
		catch (Exception ex) {
			System.out.println("inside catch block");
		}
		finally {
			//Risky code
			System.out.println("inside finally block");
		}
	}

}
