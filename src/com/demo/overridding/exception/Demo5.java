package com.demo.overridding.exception;

public class Demo5 {
	public static void main(String[] args) {
		Derived3 derived1= new Derived3();
		derived1.m1();
		
		
	}
	

}
class Base3 {
    void m1()throws NullPointerException{
System.out.println("Base");

    }
    
}

class Derived3 extends Base3{
	@Override
	void m1()throws RuntimeException {
		System.out.println("example");
		
	}

}

