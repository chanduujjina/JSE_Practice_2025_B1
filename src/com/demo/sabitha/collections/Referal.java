package com.demo.sabitha.collections;

import java.lang.reflect.Method;

public class Referal {
	public static void main(String[] args) throws ClassNotFoundException {
			Class<?> method = Class.forName("java.util.Stack");
			Method[] methods = method.getMethods();
			for(Method m:methods) {
				System.out.println(m);
			}
	}

}
