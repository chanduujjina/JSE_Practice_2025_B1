package com.demo.rajasekhar.methodoverloading;

public class MethodOverLoadingDemo4 {
	public static void main(String[] args) {
		m1(1,2);
	}
	static void m1(long a, int b)
	{
		System.out.println("long, int");
	}
	static void m1(int a, long b)
	{
		System.out.println("int, long");
	}

}

