package com.demo.exception.handler.revice;

public class ExceptionDemo4 {
	
	public static void main(String[] args) {
		
		try {
			throw new RuntimeException();
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("array index error");
		}
		catch(Exception ex) {
			System.out.println("generic error");
		}
	}

}
