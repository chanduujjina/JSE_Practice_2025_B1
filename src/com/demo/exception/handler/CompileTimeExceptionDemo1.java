package com.demo.exception.handler;

public class CompileTimeExceptionDemo1 {
	
	
	public static void main(String[] args) {
		m1("com.demo.exception.handler.Test");
	}
	
	
    public static String m1(String className) {
		
		try {
			return m2(className);
		} catch (ClassNotFoundException e) {
			return "No Class Found";
		}
		
	}
	
	public static String m2(String className) throws ClassNotFoundException {
		
		Class<?> cls = Class.forName(className);
		return cls.getName();
		
	}

}
