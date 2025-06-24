package com.demo.MethodOverloadingAssignment;

public class Demo1 {
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.m1(1, 1);
	}
	public void m1(byte a, int b) {
		System.out.println("byte, int");
	}
	public void m1(int a, int b) {
		System.out.println("int, int");
	}
	

}
