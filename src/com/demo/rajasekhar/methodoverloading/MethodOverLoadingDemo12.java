package com.demo.rajasekhar.methodoverloading;

public class MethodOverLoadingDemo12 {
	public static void main(String[] args) {
		m1(1,2);
	}
	static void m1(Integer a, Integer b)
	{
		System.out.println("Integer, Integer");
	}
	static void m1(int...a)
	{
		System.out.println("int");
	}
}

