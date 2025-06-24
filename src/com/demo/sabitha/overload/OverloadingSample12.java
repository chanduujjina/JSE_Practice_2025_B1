package com.demo.sabitha.overload;

public class OverloadingSample12 {
	public static void main(String[] args) {
		new OverloadingSample12().m1(10,20);
	}
	public void m1(Integer a,Long b) {
		System.out.println("int,long");
		
	}
	public void m1(int  ...a) {
		System.out.println("var agrs");
		
	}

}
