package com.demo.exception.handler.revice;

public class ExceptionDemo3 {
	
	public static void main(String[] args) {
		
		
		try {
			int result = 1/0;
			Class.forName("com.demo.exception.handler.revice.ExceptionDemo21");
			System.out.println(result);
		} catch (ClassNotFoundException e) {
			System.out.println("Exception");
		}
		 catch (Exception e) {
			System.out.println("RunTime");
		}
	}

}
