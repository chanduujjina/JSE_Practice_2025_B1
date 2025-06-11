package com.demo.oops.abstraction;

public class AbstractHandler2 {
	
	public static void main(String[] args) {
		
		BaseService baseService1 = new VendorService1();
		
		baseService1.m2();
		
		baseService1.m2();
	}
	

}

interface BaseService {
	
	void m1();
	
	void m2();
	
	
}


class VendorService1 implements BaseService {

	@Override
	public void m1() {
		System.out.println("inside VendorService1 m1()");
		
	}

	@Override
	public void m2() {
		System.out.println("inside VendorService1 m2()");// TODO Auto-generated method stub
		
	}

	
	
}

class VendorService2 implements BaseService {
	@Override
	public void m1() {
		System.out.println("inside VendorService2 m1()");
		
	}

	@Override
	public void m2() {
		System.out.println("inside VendorService2 m2()");
		
	}
}


