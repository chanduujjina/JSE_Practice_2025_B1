package com.demo.exceptionAssignment;

public class ExceptionTricyDemo1 {
	public static void main(String[] args) {
		Child child = new Child();
		child.m1();
	}
}
class Parent{
	public void m1() throws Exception{
		System.out.println("Parent");
	}
}
class Child extends Parent{
	public void m1() throws ArithmeticException {
		System.out.println("Child");
	}
}
