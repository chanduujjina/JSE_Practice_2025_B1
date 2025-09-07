package com.demo.sabitha.thread.checks;
public class StringBuliderThread {
	
	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder();
		Runnable r1=()->{
			for(int i=0;i<100;i++) {
				s1.append(i);
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
		System.out.println(s1.length());
		
	}
	

}
