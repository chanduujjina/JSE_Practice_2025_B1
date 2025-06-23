package com.demo.OOPSpractice;

public class AbstractionDemo {
	public static void main(String[] args) {
		Bn bn = new Bn();
		bn.m();
		bn.f();
	}
}
abstract class An{
	abstract void m();
	void f() {
		System.out.println("f");
	}
}
class Bn extends An{
	void m() {
		System.out.println("Abstraction");
	}
}