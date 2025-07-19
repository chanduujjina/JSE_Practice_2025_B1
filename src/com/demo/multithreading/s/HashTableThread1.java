package com.demo.multithreading.s;

import java.util.Hashtable;
import java.util.Stack;

public class HashTableThread1 {
	public static void main(String[] args) {
		Hashtable<String, Integer> vector1=new Hashtable<>();
		Runnable r1=()->{
			for(int i=1;i<=100;i++) {
				vector1.put(String.valueOf(i),i);
				
			}
		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r1);
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(vector1.size());
	}

}
