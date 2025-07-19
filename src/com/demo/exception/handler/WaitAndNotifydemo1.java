package com.demo.exception.handler;

public class WaitAndNotifydemo1 {
	
	public static void main(String[] args) {
		
		SharedResource sharedResource = new SharedResource();
		
		Runnable producer =  ()-> {
			
			for (int i =1;i<=5;i++) {
				try {
					sharedResource.produce(i);
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Runnable consumer =  ()-> {
			for (int i =1;i<=5;i++) {
				try {
					sharedResource.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		};
		
		Thread t1 = new Thread(producer);
		
		Thread t2 = new Thread(consumer);
		
		t1.start();
		
		t2.start();
		
	}

}
