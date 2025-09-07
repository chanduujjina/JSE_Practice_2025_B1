package com.demo.oops.sabitha.datatype;
public class OverLoadAmbiguityDemo1 {
	public static void main(String[] args) {
		new OverLoadAmbiguityDemo1().m1(10,10);
		
	}
	public void m1(int val1,long val2) {
		System.out.println("2");
	}
	//any where in the line exact match print that only
	public void m1(int val1,int val2) {
		System.out.println("1");
	}
	

}
