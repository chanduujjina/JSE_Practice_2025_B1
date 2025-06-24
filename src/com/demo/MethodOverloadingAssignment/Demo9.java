package com.demo.MethodOverloadingAssignment;

public class Demo9 {
	public static void main(String[] args) {
		Demo9 d = new Demo9();
		d.m1(1, 1);
	}
	public void m1(long a, Integer b) {
		System.out.println("Integer, long");
	}
	public void m1(Integer a, long b) {
		System.out.println("Integer, long");
	}

}
