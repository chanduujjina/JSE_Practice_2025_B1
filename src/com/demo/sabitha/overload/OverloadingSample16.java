package com.demo.sabitha.overload;

public class OverloadingSample16 {
	public static void main(String[] args) {
		new OverloadingSample16().m1(1,2,3,4);
	}
	public void m1(int a,int b) {
		System.out.println("Integer,Integer");
		
	}
	public void m1(int  ...a) {
		System.out.println("var agrs");
		
	}

}
