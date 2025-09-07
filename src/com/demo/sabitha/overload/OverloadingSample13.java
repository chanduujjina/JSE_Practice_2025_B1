package com.demo.sabitha.overload;

public class OverloadingSample13 {
	public static void main(String[] args) {
		new OverloadingSample13().m1(10,20);
	}
	public void m1(Integer a,Integer b) {
		System.out.println("Integer,Integer");
		
	}
	public void m1(int  ...a) {
		System.out.println("var agrs");
		
	}

}
