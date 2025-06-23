package com.demo.exceptionAssignment;

import java.io.IOException;

public class Demo6 {
	public static void main(String[] args) {
		Child5 ch = new Child5();
		ch.show();
	}

}
class Parent5 {
    void show() throws IOException {
        System.out.println("Parent");
    }
}

class Child5 extends Parent5 {
    @Override
    void show() {
        System.out.println("Child");
    }
}