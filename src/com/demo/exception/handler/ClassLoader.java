package com.demo.exception.handler;

public class ClassLoader {
	
	public static void main(String[] args) {
		
		
		//request 1
		String loadClass1 = loadClass("com.demo.exception.handler.Test");
		System.out.println(loadClass1);
		
		//request 2
		String loadClass2 = loadClass("com.demo.exception.handler.Test1");
		System.out.println(loadClass2);
		
		
	}
	
	public static String  loadClass(String className) {
		
		//load the class using reflection api
		Class<?> cls = null;
		try {
			cls = Class.forName(className);
			System.out.println(cls);
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			return "Thre is no class Found";
			
		}
		return cls.getName();
	}

}
