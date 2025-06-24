package com.demo.MethodOverloadingAssignment;

public class Demo8 {
	public static void main(String[] args) {
		Demo8 d = new Demo8();
		d.m1(1, 1);
	}
	public void m1(Integer a, long b) {
		System.out.println("Integer, long");
	}
	public void m1(Integer a, Integer b) {
		System.out.println("Integer, Integer");
	}

}
