package com.demo.oops.sabitha.datatype;
public class OverLoadAmbiguityDemo4 {
	public static void main(String[] args) {
		new OverLoadAmbiguityDemo4().m1(10,10);
		
	}
	public void m1(int val1,float val2) {
		System.out.println("2");
	}
	public void m1(int ...a) {
		System.out.println("1");
	}
	

}
