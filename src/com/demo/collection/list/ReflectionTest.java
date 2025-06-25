package com.demo.collection.list;

import java.lang.reflect.Method;

public class ReflectionTest {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class<?> cls = Class.forName("java.util.ArrayList");
		
		Method[] declaredMethods = cls.getMethods();
		
		for (Method method : declaredMethods) {
			System.out.println(method.toString());
		}
	}

}
