package com.demo.muliThreading.revice;

public class ThreadDemo2 {

	public static void main(String[] args) {

		

		Thread t1 = new Thread(() -> {
			System.out.println("Inside task1");
		});
		
	
		
		t1.start();
		
		//t1.start();
		
		t1.run();//calling run method first time
		
		t1.run();//calling run method second time

	}
}