package com.demo.oops.abstraction;

public class AbstractHandler3 {
	
	public static void main(String[] args) {
		
		
		//request
		BaseFacility1 baseFacility1 = new VendorFacility1();
		baseFacility1.m1();
		
		baseFacility1.m2();
		
		baseFacility1.m2();
		
		
	}
	

}

interface BaseFacility1 {
	
	void m1();
	
	void m2();
	
	
}

interface BaseFacility2 {
	
	void m1();
	
	void m3();
	
	
}



class VendorFacility1 implements BaseFacility1,BaseFacility2 {

	@Override
	public void m1() {
		System.out.println("inside VendorService1 m1()");
		
	}

	@Override
	public void m2() {
		System.out.println("inside VendorService1 m2()");// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		System.out.println("inside VendorService1 m3()");// TODO Auto-generated method stub
		
	}

	
	
}

class VendorFacility2 implements BaseFacility1,BaseFacility2 {
	@Override
	public void m1() {
		System.out.println("inside VendorService2 m1()");
		
	}

	@Override
	public void m2() {
		System.out.println("inside VendorService2 m2()");
		
	}

	@Override
	public void m3() {
		System.out.println("inside VendorService2 m3()");
		
	}
}


