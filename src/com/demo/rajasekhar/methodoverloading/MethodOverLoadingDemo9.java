package com.demo.rajasekhar.methodoverloading;

public class MethodOverLoadingDemo9 {
	public static void main(String[] args) {
		m1(1,2);
	}
	static void m1(Long a, Integer b)
	{
		System.out.println("Long, Integer");
	}
	static void m1(Integer a, Long b)
	{
		System.out.println("Integer, Long");
	}

}

