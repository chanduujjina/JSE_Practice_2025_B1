package com.demo.muliThreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInterDemo1 {
	
	static AtomicInteger atomicInteger = new AtomicInteger();//shared resource
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(()->{
			
			for (int i =1;i<=1000;i++) {
				atomicInteger.incrementAndGet();
			}
		});
		
       Thread t2 = new Thread(()->{
			
			for (int i =1;i<=1000;i++) {
				atomicInteger.incrementAndGet();
			}
		});
       
       t1.start();
		
       t2.start();
       
       //lets wait to finish all threads
       
       try {
		t1.join();
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
       System.out.println("Final count ::"+atomicInteger.get());
		
	}

}
