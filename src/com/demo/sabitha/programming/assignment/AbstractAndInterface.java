package com.demo.sabitha.programming.assignment;
 abstract class A1{
	 abstract void m1(int x);
}
 interface I1{
	 int m2(String str);
	 char m3(float a);
 }

class AbstractAndInterface extends A1 implements I1{
	public int m2(String str) {
		System.out.println(str);
		return 100;
		
	}
	public char m3(float a) {
		System.out.println(a);
		return 's';
	}
	void m1(int x) {
		System.out.println(x+" ");
		
	}
	public static void main(String[] args) {
		new AbstractAndInterface().m1(20);
		System.out.println(new AbstractAndInterface().m2("sabitha"));
		System.out.println(new AbstractAndInterface().m3(20));
	}

	

}
