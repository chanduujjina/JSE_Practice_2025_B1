package com.demo.overridding.exception;

public class Demo6 {
	public static void main(String[] args) {
		Derived4 derived1= new Derived4();
		derived1.m1();
		
		
	}
	

}
class Base4 {
    void m1()throws NullPointerException{
System.out.println("Base");

    }
    
}

class Derived4 extends Base4{
	@Override
	void m1()throws RuntimeException {
		System.out.println("example");
		
	}

}

