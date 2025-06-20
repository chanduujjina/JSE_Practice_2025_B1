package com.demo.exception.handler.revice;

public class ExceptionDemo6 {
	
	public static void main(String[] args) {
		
		try {
			int result = 10/0;
		}
		catch(RuntimeException ex) {
			System.out.println("Runtime");
		}
		catch(Exception ex) {
			System.out.println("Exception");
		}
		catch(Throwable ex) {
			System.out.println("Throwble");
		}
	}

}
