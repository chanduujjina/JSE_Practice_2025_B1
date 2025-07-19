package com.demo.exception.handler;

public class DeadLockAvoid {
	
	private static final Object resource1 = new Object();
	private static final Object resource2 = new Object();
	public static void main(String[] args) {
		Runnable task1 = ()->{
			
			synchronized (resource1) {
				System.out.println("resource1 locked by "+Thread.currentThread().getName());
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized (resource2) {
					System.out.println("resource2 locked by "+Thread.currentThread().getName());
				}
			}
			
		};
		Thread t1 = new Thread(task1,"Thread 1");
		
		Thread t2 = new Thread(task1,"Thread 2");
		
		t1.start();
		
		t2.start();
	}

}
