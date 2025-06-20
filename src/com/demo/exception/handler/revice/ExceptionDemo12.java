package com.demo.exception.handler.revice;

public class ExceptionDemo12 {
	
	public static void main(String[] args) {
		
		try {
			int result = 10/0;
		}
		catch(Exception ex) {
			ex = new RuntimeException("denomintator should not be zero it will give infinite value");
			System.out.println(ex.getMessage());
		}
	}
	
	
}
