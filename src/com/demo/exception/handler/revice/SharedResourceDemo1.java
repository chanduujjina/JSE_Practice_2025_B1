package com.demo.exception.handler.revice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SharedResourceDemo1 {
	
	static List<Integer> sharedList = new CopyOnWriteArrayList<>();
	
	public static void main(String[] args) {
		
		Runnable task1 = ()-> {
			
			for (int i =1;i<=1000;i++) {
				sharedList.add(i);
			}
			
		};
		
		Thread t1 = new Thread(task1);
		
		Thread t2 = new Thread(task1);
		
		t1.start();
		
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(sharedList.size());
		
	}

}
