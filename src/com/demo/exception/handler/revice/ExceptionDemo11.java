package com.demo.exception.handler.revice;

public class ExceptionDemo11 {
	
	public static void main(String[] args) {
		
		try {
			m1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void m1() throws Exception{
		try {
			throw new RuntimeException("runtime error");
		}
		finally {
			throw new Exception("generic error");
		}
	}

}
