package com.demo.muliThreading.revice;

public class ThreadDemo1 {

	public static void main(String[] args) {

		// create a Thread

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside task1");

			}
		});

		Thread t2 = new Thread(() -> {
			System.out.println("Inside task2");
		});
		
		t1.start();
		
		t2.start();

	}
}