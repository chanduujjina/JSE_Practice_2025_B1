package com.demo.oops.polymorphism.revise;

public class OVetrloadTrickReviceDemo3 {
	
	public static void main(String[] args) {
		OVetrloadTrickReviceDemo3 vetrloadTrickReviceDemo1 = new OVetrloadTrickReviceDemo3();
		
		vetrloadTrickReviceDemo1.m1(1, 1);
	}
	
	
	public void m1(int a, long b) {//more specific match with Widening
		System.out.println("int,long");
	}
	
	public void m1(int a, Integer b) {//more specific match with AutoBoxing
		System.out.println("int,Integer");
	}

}
