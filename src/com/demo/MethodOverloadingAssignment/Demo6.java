package com.demo.MethodOverloadingAssignment;

public class Demo6 {
	public static void main(String[] args) {
		Demo6 d = new Demo6();
		d.m1(1, 1);
	}
	public void m1(long a, int b) {
		System.out.println("long, int");
	}
	public void m1(Integer a, Integer b) {
		System.out.println("Integer, Integer");
	}

}
