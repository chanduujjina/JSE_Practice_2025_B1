package com.demo.muliThreading;

public class SynchrnousDemo1 {
	
	public static void main(String[] args) {
		
		Counter1 counter = new Counter1();
		
		Thread t1 = new Thread(()-> {
			for (int i =1;i<=1000;i++) {
				
				synchronized (counter) {
					counter.increment();//sensitive operation
				}
				
			}
		});
		
		
		Thread t2 = new Thread(()-> {
			for (int i =1;i<=1000;i++) {
				synchronized (counter) {
					counter.increment();//sensitive operation
				}
			}
		});
		
		//start thread 1
		t1.start();
		
		//start thread 2
		
		t2.start();
		
		
		try {
			t1.join();
			
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Final count :"+counter.getCounter());
	}

}
