package com.demo.rajasekhar.methodoverloading;

public class MethodOverLoadingDemo5 {
	public static void main(String[] args) {
		m1(1,2);
	}
	static void m1(long a, int b)
	{
		System.out.println("long, int");
	}
	static void m1(int...a)
	{
		System.out.println("int");
	}

}

