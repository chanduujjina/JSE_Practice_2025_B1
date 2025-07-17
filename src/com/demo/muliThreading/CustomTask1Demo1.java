package com.demo.muliThreading;

public class CustomTask1Demo1 {
	
	public static void main(String[] args) {
		
		
		for (int i =1;i<=5;i++) {
			CustomTask1 customTask1 = new CustomTask1();
			customTask1.start();
		}
	}

}
