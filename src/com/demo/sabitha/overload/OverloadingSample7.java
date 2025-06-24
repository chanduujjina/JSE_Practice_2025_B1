package com.demo.sabitha.overload;

public class OverloadingSample7 {
	public static void main(String[] args) {
		new OverloadingSample7().m1(10,20);
	}
	public void m1(Integer i,Integer j) {
		System.out.println("Integer,Integer");
		
	}
	public void m1(Integer i,Long j) {
		System.out.println("Integer,long");
		
	}

}
