package com.demo.sabitha.oop.object.immutable;

public class ChanceOfImmutable {
	public static void main(String[] args) {
		//BaseClass b1=new DerivedClass("sabitha",12);
		//b1.m1();
		BaseClass b2=new BaseClass("teja",1);
		System.out.println(b2.getStr());
	System.out.println(b2.getX());
		
		b2.m1();
	}
	
} 
class BaseClass{
	private String str;
	private int x;
	public BaseClass(String str,int x) {
		this.str=str;
		this.x=x;
	}
	public String getStr() {
		return str;
	}
	public int getX() {
		return x;
	}
	public void m1() {
		System.out.println("inside of Baseclass");
	}
}
class DerivedClass extends BaseClass{

	public DerivedClass(String str, int x) {
		super(str, x);
	}
	@Override
	public void m1() {
		//super.m1();
		System.out.println("outside of Base class");
	}

	

	
	
}
