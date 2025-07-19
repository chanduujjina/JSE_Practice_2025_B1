package com.demo.sabitha.thread.checks;
import java.util.LinkedHashSet;
import java.util.Set;


public class SetThread2 {
	
	public static void main(String[] args) {
		Set<Integer> s1=new LinkedHashSet<>();
		Runnable r1=()->{
			for(int i=0;i<100;i++) {
				s1.add(i);
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
		System.out.println(s1.size());
		
	}
	

}
