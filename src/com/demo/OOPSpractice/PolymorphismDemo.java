package com.demo.OOPSpractice;

public class PolymorphismDemo {
	public static void main(String[] args) {
		Animal1 dog = new Dog1();
		dog.sound();
	}
}
class Animal1{
	public void sound() {
		System.out.println("a");
	}
}
class Dog1 extends Animal1{
	public void sound() {
		System.out.println("b");
	}
}
