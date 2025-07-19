package com.demo.multithreading.s;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class StringBuilderThread1 {
	public static void main(String[] args) {
	StringBuilder set1=new StringBuilder();
		Runnable r1=()->{
			for(int i=0;i<100;i++) {
				set1.append(i);
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
		System.out.println(set1.length());
	}

}
