package com.demo.OOPSpractice;

public class InheritanceDemo {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.bark();
	}
}
class Animal{
	public void eat() {
		System.out.println("Animals can eat");
	}
}
class Dog extends Animal{
	public void bark() {
		System.out.println("Dogs bark");
	}
}
