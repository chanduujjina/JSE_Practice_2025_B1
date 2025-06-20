package com.demo.exception.handler;

public class RuntimeExecptionHandlerDemo2 {
	
	public static void main(String[] args) {
		
		int result = 0;
		try {
			result = 1/0;//program terminates abruptly
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		System.out.println(result);
	}

}
