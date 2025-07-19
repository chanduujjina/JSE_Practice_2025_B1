package com.demo.exception.handler;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo1 {
	
	public static void main(String[] args) {
		
		
		Callable<String> callable = ()-> "task 1 completed";
		
		try (ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor()) {
			
			Future<String> future = newSingleThreadExecutor.submit(callable);
			
			System.out.println(future.get());
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
