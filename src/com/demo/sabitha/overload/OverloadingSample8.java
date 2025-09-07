package com.demo.sabitha.overload;

public class OverloadingSample8 {
	public static void main(String[] args) {
		new OverloadingSample8().m1(10,20);
	}
	public void m1(long i,Integer j) {
		System.out.println("long,Integer");
		
	}
	public void m1(Integer i,Long j) {
		System.out.println("Integer,long");
		
	}

}
