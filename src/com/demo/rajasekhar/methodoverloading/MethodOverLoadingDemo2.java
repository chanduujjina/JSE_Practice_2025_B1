package com.demo.rajasekhar.methodoverloading;

public class MethodOverLoadingDemo2 {
	public static void main(String[] args) {
		m1(1,2);
	}
	static void m1(short a, int b)
	{
		System.out.println("short, int");
	}
	static void m1(int a, long b)
	{
		System.out.println("int, long");
	}

}

