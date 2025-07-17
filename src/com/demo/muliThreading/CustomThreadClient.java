package com.demo.muliThreading;

public class CustomThreadClient {
	
	public static void main(String[] args) throws InterruptedException {
		
		//create Thread1
		
		CustomThread customThread1 = new CustomThread();//New
		
		System.out.println("state of Thread after creating object "+customThread1.getState());
		
		customThread1.start();
		
		
		
		customThread1.join();
		
		System.out.println("state of Thread after calling join method "+customThread1.getState());
		
		
	}

}
