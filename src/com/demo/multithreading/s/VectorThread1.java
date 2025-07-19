package com.demo.multithreading.s;

import java.util.Vector;

public class VectorThread1 {
	public static void main(String[] args) {
		 
		Vector<Integer> vector1=new Vector<>();
		Runnable r1=()->{
			for(int i=1;i<=100;i++) {
				vector1.add(i);
				
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
