package com.demo.oops.abstraction;

public class AbstarctHandler5 {

}

interface Parent {
	
	public static void m1() {
		System.out.println("Inside m1 Parent class");
	}
	
	
	abstract void m2();
	
	default void m3() {
		System.out.println("Inside m3 method parent class");
	}
}

class Child1 implements Parent {

	@Override
	public void m2() {
		System.out.println("Inside m2 Child1 ::");
		
	}
	@Override
	public void m3() {
		System.out.println("Inside m3 method Child1 class");
	}
	
	
}

class Child2 implements Parent {
	@Override
	public void m2() {
		System.out.println("Inside m2 Child2 ::");
		
	}
	
	@Override
	public void m3() {
		System.out.println("Inside m3 method Child2 class");
	}
	
}


class Child3 implements Parent {
	@Override
	public void m2() {
		System.out.println("Inside m2 Child3 ::");
		
	}
}

class Child4 implements Parent {
	@Override
	public void m2() {
		System.out.println("Inside m2 Child4 ::");
		
	}
}