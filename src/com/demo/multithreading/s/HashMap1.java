package com.demo.multithreading.s;

import java.util.HashMap;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap<String, Integer> list=new HashMap<>();
		Runnable r1=()->{
			for(int i=0;i<100;i++) {
				list.put(String.valueOf(i),i);
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
		System.out.println(list.size());
		
	}

}
