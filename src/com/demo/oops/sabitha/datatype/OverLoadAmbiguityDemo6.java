package com.demo.oops.sabitha.datatype;
public class OverLoadAmbiguityDemo6 {
	public static void main(String[] args) {
		new OverLoadAmbiguityDemo6().m1(10,20);
		
	}
	public void m1(int val1,float val2) {
		System.out.println("2");
	}
	public void m1(Integer val1,Integer val2) {
		System.out.println("1");
	}
	

}
