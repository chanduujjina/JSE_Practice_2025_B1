package com.demo.rajasekhar.methodoverloading;

public class MethodOverLoadingDemo7 {
	public static void main(String[] args) {
		// m1(1,2);
	}
	static void m1(Integer a, long b)
	{
		System.out.println("Integer, long");
	}
	static void m1(Integer a, Integer b)
	{
		System.out.println("Integer, Integer");
	}

}

