package com.demo.MethodOverloadingAssignment;

public class Demo11 {
	public static void main(String[] args) {
		Demo11 d = new Demo11();
		d.m1(1, 1);
	}
	public void m1(Integer a, Integer b) {
		System.out.println("Integer, Integer");
	}
	public void m1(int...a) {
		System.out.println("nt");
	}

}
