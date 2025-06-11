package com.demo.oops.abstraction;

public class AbstractHandler1 {
	
	public static void main(String[] args) {
		
		//request 1
		BaseProvider baseProvider = new Vendor1();
		
		//baseProvider.m1();
		
		//baseProvider.m2();
		
		//baseProvider.m3();
		
		// request 2
		BaseProvider baseProvider1 = new Vendor2();

		//baseProvider1.m1();

		//baseProvider1.m2();

		//baseProvider1.m3();
		
		// request 2
		BaseProvider baseProvider2 = new Vendor3();

		baseProvider2.m1();

		baseProvider2.m2();

		baseProvider1.m3();
	}
	

}

abstract class BaseProvider {
	
	public void m1() {
		System.out.println("Inside BaseProvider m1()");
	}
	
	public void m2() {
		System.out.println("Inside BaseProvider m2()");
	}
	
	abstract void m3();
}

class Vendor1 extends BaseProvider {

	@Override
	public void m3() {
		System.out.println("Inside Vendor1 m3()");
		
	}
	
	
}

class Vendor2 extends BaseProvider {
	
	@Override
	public void m3() {
		System.out.println("Inside Vendor2 m3()");
		
	}
}

class Vendor3 extends BaseProvider {
	
	@Override
	public void m2() {
		System.out.println("Inside Vendor3 m2()");
	}
	
	@Override
	public void m3() {
		System.out.println("Inside Vendor3 m3()");
		
	}
	
}

