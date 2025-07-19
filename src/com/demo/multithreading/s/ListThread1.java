package com.demo.multithreading.s;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListThread1 {
	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>();
		Runnable r1=()->{
			for(int i=0; i<100;i++) {
				list1.add(i);
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
		System.out.println(list1.size());
	}

}
