package com.demo.muliThreading;

public class CustomRunnable  implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		
	}

}
