package com.demo.exception.handler;

public class RTHandlerDemo5 {
	
	
	public static void main(String[] args) {
		
		//request1
		m1(10,5);
		
		System.out.println("-----------request 2 --------------------");
		m1(10,0);
	}

	private static void m1(int num1,int num2) {
		try {
			
			System.out.println("inside try block");
			int result  = num1/num2;
			
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
