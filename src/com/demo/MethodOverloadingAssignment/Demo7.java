package com.demo.MethodOverloadingAssignment;

public class Demo7 {
	public static void main(String[] args) {
		Demo7 d = new Demo7();
		d.m1(1, 1);
	}
	public void m1(Integer a, Integer b) {
		System.out.println("Integer, Integer");
		}
	public void m1(Integer a, Integer b) {
		System.out.println("int, Integer");
	}

}
