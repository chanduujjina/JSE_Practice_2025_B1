package com.demo.exception.handler.revice;

public class ExceptionDemo10 {
	
	public static void main(String[] args) {
		
		int value = getValue();
		System.out.println(value);
	}
	
	public static int getValue() {
		try {
			return 1;
		}
		finally {
			return 2;
		}
	}

}
