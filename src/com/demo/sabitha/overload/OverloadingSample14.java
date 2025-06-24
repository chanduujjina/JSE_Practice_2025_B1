package com.demo.sabitha.overload;

public class OverloadingSample14 {
	public static void main(String[] args) {
		new OverloadingSample14().m1(10,20);
	}
	public void m1(Long a,Long b) {
		System.out.println("Integer,Integer");
		
	}
	public void m1(int  ...a) {
		System.out.println("var agrs");
		
	}

}
