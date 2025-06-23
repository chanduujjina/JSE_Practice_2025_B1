package com.demo.overridding.exception;

import java.io.FileNotFoundException;
import java.io.IOException;


public class Demo16 {
	public static void main(String[] args) {
		Derived13 derived1= new Derived13();
		derived1.m1();
		
		
	}
	

}
class Base13 {
    void m1() {
System.out.println("Base");

    }
    
}

class Derived13 extends Base13{
	@Override
	void m1() throws RuntimeException{
		System.out.println("example");
		
	}

}

