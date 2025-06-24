package com.demo.rajasekhar.methodoverloading;

public class MethodOverLoadingDemo8 {
	public static void main(String[] args) {
		m1(1,2);
	}
	static void m1(Integer a, Long b)
	{
		System.out.println("Integer, Long");
	}
	static void m1(Integer a, Integer b)
	{
		System.out.println("Integer, Integer");
	}

}

