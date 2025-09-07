package com.demo.sabitha.overload;

public class OverloadingSample15 {
	public static void main(String[] args) {
		new OverloadingSample15().m1();
	}
	public void m1(int a,int b) {
		System.out.println("Integer,Integer");
		
	}
	public void m1(int  ...a) {
		System.out.println("var agrs");
		
	}

}
