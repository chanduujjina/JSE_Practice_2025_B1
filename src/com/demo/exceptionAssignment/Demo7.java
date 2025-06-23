package com.demo.exceptionAssignment;

public class Demo7 {
	public static void main(String[] args) {
		Child3 ch = new Child3();
		ch.show();
	}

}
class Parent3 {
    void show() throws NumberFormatException {
        System.out.println("Parent");
    }
}

class Child3 extends Parent3 {
    @Override
    void show() throws IllegalArgumentException {
        System.out.println("Child");
    }
}
