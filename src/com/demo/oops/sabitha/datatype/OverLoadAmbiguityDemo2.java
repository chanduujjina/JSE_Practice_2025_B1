package com.demo.oops.sabitha.datatype;
public class OverLoadAmbiguityDemo2 {
	public static void main(String[] args) {
		//new OverLoadAmbiguityDemo2().m1(10,10);
		
	}
	// this kind of parameters in method call go confuse
	public void m1(long val1,int val2) {
		System.out.println("2");
	}
	public void m1(int val1,long val2) {
		System.out.println("1");
	}
	

}
