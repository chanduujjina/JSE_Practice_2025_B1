package com.demo.muliThreading;

public class JoinDemo1 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//task1 
		Runnable runnable1 = ()-> System.out.println(Thread.currentThread()+" name "+Thread.currentThread().getName());
		
		//task2
		Runnable runnable2 = ()-> System.out.println(Thread.currentThread() + "name "+Thread.currentThread().getName());
		
		Thread thread1 = new Thread(runnable1, "Thread 1");
		
		Thread thread2 = new Thread(runnable2, "Thread 2");
		
		//start thread1
		
		thread1.start();
		
		thread1.join();
		
		thread2.start();
		
	}
	

}
