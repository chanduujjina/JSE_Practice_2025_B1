package com.demo.muliThreading;

public class AsynchrnousDemo1 {
	
	public static void main(String[] args) {
		
		
		Thread thread1 = new Thread(()-> {
			for (int i =1;i<=10;i++) {
				System.out.println(i);
			}
		});
		
		
		Thread thread2 = new Thread(()-> {
			for (int i =11;i<=20;i++) {
				System.out.println(i);
			}
		});
		
		//start thread 1
		thread1.start();
		
		//start thread 1
		thread2.start();
		
	}

}
