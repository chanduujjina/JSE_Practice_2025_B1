package com.demo.exception.handler;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo2 {
	
	public static void main(String[] args) {
		
		List<Callable<String>> taskList = getCallableList();
		
		
		
		try (ExecutorService threadPool = Executors.newFixedThreadPool(10)) {
			
			List<Future<String>> futureList = threadPool.invokeAll(taskList);
			
			for (Future<String> future : futureList) {
				System.out.println(future.get());
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	private static List<Callable<String>> getCallableList(){
		String basetask = "task {num} completed";
		List<Callable<String>>  callableList = new ArrayList<>();
		for (int i =1;i<=50;i++) {
			String replace = basetask.replace("{num}", String.valueOf(i));
			callableList.add(()-> replace);
		}
		
		return callableList;
	}

}
