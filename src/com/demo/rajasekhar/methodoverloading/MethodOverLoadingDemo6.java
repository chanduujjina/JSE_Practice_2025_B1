package com.demo.rajasekhar.methodoverloading;

public class MethodOverLoadingDemo6 {
	public static void main(String[] args) {
		m1(1,2);
	}
	static void m1(long a, int b)
	{
		System.out.println("long, int");
	}
	static void m1(Integer a, Integer b)
	{
		System.out.println("Integer, Integer");
	}

}

