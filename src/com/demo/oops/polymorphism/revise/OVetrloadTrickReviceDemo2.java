package com.demo.oops.polymorphism.revise;

public class OVetrloadTrickReviceDemo2 {
	
	public static void main(String[] args) {
		OVetrloadTrickReviceDemo2 vetrloadTrickReviceDemo1 = new OVetrloadTrickReviceDemo2();
		
		vetrloadTrickReviceDemo1.m1(1, 1);
	}
	
	
	public void m1(int a, long b) {//more specific match
		System.out.println("int,int");
	}
	
	public void m1(long a, int b) {//more specific match
		System.out.println("long,int");
	}

}
