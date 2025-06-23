package com.demo.exceptionAssignment;

public class Demo2 {
	public static void main(String[] args) {
		Child2 child2 = new Child2();
		child2.show();
	}
}
class Parent2 {
    void show() throws IndexOutOfBoundsException {
        System.out.println("Parent");
    }
}

class Child2 extends Parent2 {
    
    void show() throws IndexOutOfBoundsException {
        System.out.println("Child");
    }
}
