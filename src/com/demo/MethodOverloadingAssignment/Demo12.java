package com.demo.MethodOverloadingAssignment;

public class Demo12 {
	public static void main(String[] args) {
		Demo12 d = new Demo12();
		d.m1(1, 1);
	}
	public void m1(long a, long b) {
		System.out.println("long, long");
	}
	public void m1(int...a) {
		System.out.println("int");
	}

}
