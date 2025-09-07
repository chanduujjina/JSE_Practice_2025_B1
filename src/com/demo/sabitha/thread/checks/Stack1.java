package com.demo.sabitha.thread.checks;

import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		Stack<String> v1=new Stack<>();
		Runnable r1=()->{
			for(int i=1;i<=100;i++) {
				v1.add(String.valueOf(i));
			}
		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r1);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(v1.size());
	}

}
