package com.demo.oops.polymorphism;

public class Runtimehandler {
	
	public static void main(String[] args) {
		
	//request
	 Parent parent = new Child1();
	 
	 parent.m1();
	 
	 parent.m2();
	 
	 parent.m3();
	 
	 //request 2
	 
	 Parent parent2 = new Child2();
	 
	 parent2.m1();
	 
	 parent2.m2();
	 
	 //request 3
	 
	 Child1 child1 = new Child1();
	 
	 child1.m3("test");
	 
	}

}

class Parent {
	public void m1() {
		System.out.println("inside m1 Parent class");
	}
	
	public void m2() {
		System.out.println("inside m2 Parent class");
	}
	
	public void m3() {
		System.out.println("inside m3 Parent class");
	}
}

class Child1 extends Parent{
	@Override
	public void m1() {
		System.out.println("inside m1 Child1 class");
	}
	
	
	public void m3(String val) {
		System.out.println("inside m3 Parent class");
	}
}

class Child2 extends Parent {
	@Override
	public void m1() {
		System.out.println("inside m1 Child2 class");
	}
}
