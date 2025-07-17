package com.demo.muliThreading;

public class JoinDemo2 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//task1 
		Runnable runnable1 = ()-> {
			
			for (int i =1;i<=10;i++) {
				System.out.println(i);
			}
			
		};
		
		//task2
		Runnable runnable2 = ()-> {
			for (int i =11;i<=20;i++) {
				System.out.println(i);
			}
		};
		
		Thread thread1 = new Thread(runnable1, "Thread 1");
		
		Thread thread2 = new Thread(runnable2, "Thread 2");
		
		//start thread1
		
		thread1.start();
		
		thread1.join();
		
		thread2.start();
		
	}
	

}
