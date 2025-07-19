package com.demo.exception.handler;

public class DeadLockDemo1 {
	
	private static final Object resource1 = new Object();
	
	private static final Object resource2 = new Object();
	
	public static void main(String[] args) {
		
		Runnable task1 = ()->{
			
			synchronized (resource1) {
				System.out.println("resource1 locked by Thread 1");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized (resource2) {
					System.out.println("resource2 locked by Thread 1");
				}
			}
			
		};
		
		Runnable task2 = ()->{
			synchronized (resource2) {
				System.out.println("resource1 locked by Thread 1");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized (resource1) {
					System.out.println("resource2 locked by Thread 1");
				}
			}
		};
		
		Thread t1 = new Thread(task1);
		
		Thread t2 = new Thread(task2);
		
		t1.start();
		
		t2.start();
		
	}

}
