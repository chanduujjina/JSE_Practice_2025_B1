package com.demo.io.stream;

import java.lang.reflect.Method;

public class ReflectionTest {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class<?> cls = Class.forName("java.io.File");
		
		Method[] declaredMethods = cls.getDeclaredMethods();
		
		for (Method method : declaredMethods) {
			System.out.println(method.toString());
		}
	}

}
