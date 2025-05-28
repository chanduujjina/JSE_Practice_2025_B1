package com.demo.stringhandler;

import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionDemio1 {
	
	public static void main(String[] args) {
		
		Method[] declaredMethods = StringBuilder.class.getMethods();
		
		Arrays.stream(declaredMethods).map(Method ::toString).sorted().forEach(System.out ::println);
		
		
	}

}
