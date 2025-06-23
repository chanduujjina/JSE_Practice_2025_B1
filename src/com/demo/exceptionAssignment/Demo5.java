package com.demo.exceptionAssignment;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo5 {
	public static void main(String[] args) {
		Child7 child7 = new Child7();
		child7.show1();
	}

}
class Parent7 {
    void show1() throws IOException {
        System.out.println("Parent");
    }
}

class Child7 extends Parent7 {
    @Override
    void show1() throws FileNotFoundException {
        System.out.println("Child");
    }
}