package com.demo.MethodOverloadingAssignment;

public class Demo4 {
	public static void main(String[] args) {
		Demo4 d = new Demo4();
		d.m1(1, 1);
	}
	public void m1(long a, int b) {
		System.out.println("long, int");
	}
	public void m1(int a, long b) {
		System.out.println("int, long");
	}

}
