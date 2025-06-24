package com.demo.MethodOverloadingAssignment;

public class Demo5 {
	public static void main(String[] args) {
		Demo5 d = new Demo5();
		d.m1(1, 1);
	}
	public void m1(long a, int b) {
		System.out.println("long, int");
	}
	public void m1(int...a) {
		System.out.println("int");
	}

}
