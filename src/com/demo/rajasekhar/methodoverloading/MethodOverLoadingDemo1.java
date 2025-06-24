package com.demo.rajasekhar.methodoverloading;

public class MethodOverLoadingDemo1 {
	public static void main(String[] args) {
		m1(1,2);
	}
	static void m1(byte a, int b)
	{
		System.out.println("byte, int");
	}
	static void m1(int a,int b)
	{
		System.out.println("int, int ");
	}

}
