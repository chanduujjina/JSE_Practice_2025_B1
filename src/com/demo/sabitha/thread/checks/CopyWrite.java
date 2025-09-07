package com.demo.sabitha.thread.checks;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyWrite {
	static List<Integer> list=new CopyOnWriteArrayList<>();
	public static void main(String[] args) {
		Runnable r1=()->{
			for(int i=0;i<100;i++) {
				list.add(i);
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
