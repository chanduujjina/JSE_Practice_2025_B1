package com.demo.sabitha.overload;

public class OverloadingSample3 {
	public static void main(String[] args) {
		new OverloadingSample3().m1(10,20);
	}
	public void m1(Integer i, long j) {
		System.out.println("long,long");
		
	}
	public void m1(long i, int j) {
		System.out.println("long,int");
		
	}

}
