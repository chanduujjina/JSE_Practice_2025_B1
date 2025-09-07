package com.demo.sabitha.overload;

public class OverloadingSample10 {
	public static void main(String[] args) {
		new OverloadingSample10().m1(10,20);
	}
	public void m1(int a,long b) {
		System.out.println("int,long");
		
	}
	public void m1(int  ...a) {
		System.out.println("var agrs");
		
	}

}
