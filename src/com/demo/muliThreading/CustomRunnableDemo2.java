package com.demo.muliThreading;

public class CustomRunnableDemo2 {
	
	public static void main(String[] args) {
		
		
		Runnable runnable = ()->System.out.println("inside run method "+Thread.currentThread());
		
		Thread thread = new Thread(runnable);
		
		thread.start();
		
	}
	

}
