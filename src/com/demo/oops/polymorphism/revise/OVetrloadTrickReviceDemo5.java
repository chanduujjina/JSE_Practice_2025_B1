package com.demo.oops.polymorphism.revise;

public class OVetrloadTrickReviceDemo5 {
	
	public static void main(String[] args) {
		OVetrloadTrickReviceDemo5 vetrloadTrickReviceDemo1 = new OVetrloadTrickReviceDemo5();
		
		vetrloadTrickReviceDemo1.m1(1,2,3);
	}

	public void m1(long val, int val2) {
		
		System.out.println("inside m1 long,int");
	}
	
	public void m1(int ... a) {
		System.out.println("inside var arg");
	}
	
	


}
