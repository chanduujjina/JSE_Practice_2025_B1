package com.demo.OOPSpractice;

public class AbstractionDemo2 {
	public static void main(String[] args) {
		Animal11 cat = new Cat();
		cat.sound();
	}
}
interface Animal11{
	public void sound();
}
class Cat implements Animal11{
	public void sound() {
		System.out.println("make sound");
	}
}
