package com.demo.exception.handler;

public class RTHandlerDemo9 {
	
	
	public static void main(String[] args) {
		int numberArray []= {1,2,3,5};
		String name = null;
		
		try {
			
			
			int result = 1/2;//Arithematic Exception
			int result1 = numberArray[1];//IndexOutBoundException
			boolean isExists = name.equals("test");
		}
		catch(Exception ex) {
			if (ex instanceof ArithmeticException) {
				System.out.println("Inside Arithematic Exception "+ex.getMessage());
			}
			else if (ex instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("Inside ArrayIndexOutOfBoundsException "+ex.getMessage());
				
			}
			else if (ex instanceof NullPointerException) {
				System.out.println("Inside NullPointerException "+ex.getMessage());
				
			}
			
		}
		
		System.out.println("test");
		
		
	}

	

}
