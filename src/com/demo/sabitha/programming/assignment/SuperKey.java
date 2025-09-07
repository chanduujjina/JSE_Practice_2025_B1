package com.demo.sabitha.programming.assignment;

 class SuperKey1 {
	private String str;
	private int n;
	float x=12.0f;
	public void  m1(int a) {
		System.out.println("a value is "+a+" ");
		
	}
	public SuperKey1(String str,int n) {
		System.out.println("Base class const");
		this.str=str;
		this.n=n;
	}
	
}
class SuperKey extends SuperKey1{
	void m2(int a) {
		System.out.println(super.x);
		System.out.println(a+" ");
	}
	public SuperKey() {
		super("sabitha",30);
		m1(10);
		m2(20);
	}
	public static void main(String[] args) {
		SuperKey s=new SuperKey();
	} 
	
	
}
