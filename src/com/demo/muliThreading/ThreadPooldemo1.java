package com.demo.muliThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPooldemo1 {
	
	public static void main(String[] args) {
		
		
		//Create a Thread pool
		
		try (ExecutorService executorService = Executors.newFixedThreadPool(5)) {
			for (int i =1;i<=10;i++) {
				CustomThread3 customThread3 = new CustomThread3();
				executorService.submit(customThread3);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
