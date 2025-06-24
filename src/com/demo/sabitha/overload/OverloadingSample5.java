package com.demo.sabitha.overload;

public class OverloadingSample5 {
	public static void main(String[] args) {
		new OverloadingSample5().m1(10,20);
	}
	public void m1(Integer i,Integer j) {
		System.out.println("Integer,Integer");
		
	}
	public void m1(long i, long j) {
		System.out.println("long,long");
		
	}

}
