package com.demo.sabitha.thread.checks;

import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;

public class HashTableThread {
	public static void main(String[] args) {
		Hashtable<String,Integer> v1=new Hashtable<>();
		Runnable r1=()->{
			for(int i=1;i<=100;i++) {
				v1.put(String.valueOf(i), i);
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
		System.out.println(v1.size());
		System.out.println(v1);
	}

}
