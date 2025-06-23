package com.demo.overridding.exception;

public class Demo4 {
	public static void main(String[] args) {
		Derived2 derived1= new Derived2();
		derived1.m1();
		
		
	}
	

}
class Base2 {
    void m1()throws NumberFormatException {
System.out.println("Base");

    }
    
}

class Derived2 extends Base2{
	@Override
	void m1()throws IllegalArgumentException {
		System.out.println("Derived");
		
	}

}

