package com.demo.sabitha.overload;

public class OverloadingSample1 {
	public static void main(String[] args) {
		new OverloadingSample1().m1(10,20);
	}
	public void m1(int i, int j) {
		System.out.println("int,int");
		
	}
	public void m1(long i, int j) {
		System.out.println("long,int");
		
	}

}
