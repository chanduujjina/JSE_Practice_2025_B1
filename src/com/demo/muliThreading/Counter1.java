package com.demo.muliThreading;

public class Counter1 {
	
	private int count;
	
	public synchronized void increment() {
		count++;
	}
	
	public int getCounter() {
		return count;
	}

}
