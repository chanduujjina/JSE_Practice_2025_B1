package com.demo.oops.polymorphism.revise;

public class OVetrloadTrickReviceDemo4 {
	
	public static void main(String[] args) {
		OVetrloadTrickReviceDemo4 vetrloadTrickReviceDemo1 = new OVetrloadTrickReviceDemo4();
		
		vetrloadTrickReviceDemo1.m1(1, 1);
	}
	
	// int int -> widening(Fail) -> AutoBoxing(Fail)
	public void m1(Long a, Integer b) {//AutoBoxing -> Integer -> Long(Widending)
		System.out.println("int,Integer");
	}
	
	// int int -> widening(Fail) -> AutoBoxing(Success)
	public void m1(Integer a, Integer b) {//more specific match with Widening
		System.out.println("Integer,Integer");
	}
	


}
