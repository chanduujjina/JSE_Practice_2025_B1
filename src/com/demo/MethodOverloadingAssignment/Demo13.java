package com.demo.MethodOverloadingAssignment;

public class Demo13 {
	public static void main(String[] args) {
		Demo13 d = new Demo13();
		d.m1(1, 1);
	}
	public void m1(int a, long b) {
		System.out.println("int, long");
	}
	public void m1(int...a) {
		System.out.println("int");
	}

}
