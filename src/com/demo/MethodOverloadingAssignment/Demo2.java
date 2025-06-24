package com.demo.MethodOverloadingAssignment;

public class Demo2 {
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.m1(1, 1);
	}
	public void m1(short a, int b) {
		System.out.println("short, int");
	}
	public void m1(int a, long b) {
		System.out.println("int, long");
	}

}
