package com.demo.oops.polymorphism.revise;

public class OVetrloadTrickReviceDemo1 {
	
	public static void main(String[] args) {
		OVetrloadTrickReviceDemo1 vetrloadTrickReviceDemo1 = new OVetrloadTrickReviceDemo1();
		
		vetrloadTrickReviceDemo1.m1(1, 1);
	}
	
	
	public void m1(int a, int b) {
		System.out.println("int,int");
	}
	
	public void m1(long a, int b) {
		System.out.println("long,int");
	}

}
