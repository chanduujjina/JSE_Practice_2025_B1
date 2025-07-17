package com.demo.muliThreading;

public class CustomTask1 extends Thread

{

	@Override
	public void run() {
		System.out.println(Thread.currentThread());

	}
}