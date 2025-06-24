package com.demo.rajasekhar.methodoverloading;

public class MethodOverLoadingDemo13 {
	public static void main(String[] args) {
		m1(1,2);
	}
	static void m1(Long a, Long b)
	{
		System.out.println("Long, Long");
	}
	static void m1(int...a)
	{
		System.out.println("int");
	}
}

