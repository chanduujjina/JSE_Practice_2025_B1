package com.demo.muliThreading;

public class CustomRunnableDemo1 {
	
	public static void main(String[] args) {
		
		
		//Create Runable Object
		CustomRunnable customRunnable = new CustomRunnable();
		
		//inject Runnable into Thread Object
		
		Thread thread = new Thread(customRunnable);
		
		thread.start();
		
	}
	

}
