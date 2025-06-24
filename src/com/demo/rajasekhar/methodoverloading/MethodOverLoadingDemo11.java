package com.demo.rajasekhar.methodoverloading;

public class MethodOverLoadingDemo11 {
	public static void main(String[] args) {
		m1(1,2);
	}
	static void m1(int a, Long b)
	{
		System.out.println("int, Long");
	}
	static void m1(int...a)
	{
		System.out.println("int");
	}
}

