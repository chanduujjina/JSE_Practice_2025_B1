package com.demo.exception.handler;

public class RTHandlerDemo8 {
	
	
	public static void main(String[] args) {
		
		//request1
		m1(10,0);
		
		
		
	
	}

	private static void m1(int num1,int num2) {
		try {
			//statement 1
			//statement 2
			
			try {
				//statement 3
				//statement 4
			}
			catch(ArithmeticException ex) {
				
			}
			try {
			//statement 5
			//statement 6
			}catch (NumberFormatException nex) {
				// TODO: handle exception
			}
			
			
		}
		catch(Exception ex) {
			
		}
		finally {
			
		}
		
		try {
			
		}
		catch(Exception ex) {
			
		}
	}

}
