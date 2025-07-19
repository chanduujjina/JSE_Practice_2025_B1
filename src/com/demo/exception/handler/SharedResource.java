package com.demo.exception.handler;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
	
	private final Queue<Integer> queue = new LinkedList<>();
	
	
	public synchronized void produce(int value) throws InterruptedException {
		
		while(queue.size() == 1) {//check if list having one element
			wait();
		}
		
		queue.add(value);
		System.out.println("Produced value::"+value);
		notify();
	}
	
	public synchronized void consume() throws InterruptedException {
		
		while(queue.isEmpty()) {
			wait();
		}
		
		Integer value = queue.remove();
		
		System.out.println("consumed value "+value);
		
		notify();
		
	}

}
