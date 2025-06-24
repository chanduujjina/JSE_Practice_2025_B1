package com.demo.MethodOverloadingAssignment;

public class Demo10 {
	public static void main(String[] args) {
		Demo10 d = new Demo10();
		d.m1(1, 1);
	}
	public void m1(long a, long b) {
		System.out.println("long, long");
	}
	public void m1(Integer a, Integer b) {
		System.out.println("Integer, Integer");
	}

}
