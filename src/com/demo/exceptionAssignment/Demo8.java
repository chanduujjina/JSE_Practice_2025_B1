package com.demo.exceptionAssignment;

import java.io.IOException;

public class Demo8 {
	public static void main(String[] args) {
		Child8 ch = new Child8();
		ch.show();
	}

}
class Parent8 {
    void show() throws ClassNotFoundException {
        System.out.println("Parent");
    }
}

class Child8 extends Parent8 {
    
    void show() throws IOException {
        System.out.println("Child");
    }
}
