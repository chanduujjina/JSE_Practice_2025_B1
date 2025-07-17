package com.demo.muliThreading;

public class CustomThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("inside run method thread state "+Thread.currentThread().getState());
	}

}
