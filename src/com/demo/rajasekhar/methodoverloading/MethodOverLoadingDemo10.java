package com.demo.rajasekhar.methodoverloading;

public class MethodOverLoadingDemo10 {
	public static void main(String[] args) {
		m1(1,2);
	}
	static void m1(Long a, Long b)
	{
		System.out.println("Long, Integer");
	}
	static void m1(Integer a, Integer b)
	{
		System.out.println("Integer, Integer");
	}

}

