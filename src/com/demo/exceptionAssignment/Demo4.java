package com.demo.exceptionAssignment;

import java.io.IOException;

public class Demo4 {
	public static void main(String[] args) {
		Child6 child6 = new Child6();
		child6.show();
	}

}class Parent6 {
    void show() throws RuntimeException {
        System.out.println("Parent");
    }
}

class Child6 extends Parent6 {
    
    @Override
    void show() throws IOException {
        System.out.println("Child");
    }
}