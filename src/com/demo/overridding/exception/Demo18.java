package com.demo.overridding.exception;

import java.io.FileNotFoundException;
import java.io.IOException;


public class Demo18 {
	public static void main(String[] args) {
		Derived15 derived1= new Derived15();
		derived1.m1();
		
		
	}
	

}
class Base15 {
    void m1()throws ArithmeticException {
System.out.println("Base");

    }
    
}

class Derived15 extends Base15{
	@Override
	void m1() throws RuntimeException{
		System.out.println("example");
		
	}

}

