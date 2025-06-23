package com.demo.overridding.exception;

import java.io.FileNotFoundException;
import java.io.IOException;


public class Demo20 {
	public static void main(String[] args) {
		Derived17 derived1= new Derived17();
		derived1.m1();
		
		
	}
	

}
class Base17 {
    void m1()throws Exception {
System.out.println("Base");

    }
    
}

class Derived17 extends Base17{
	@Override
	void m1() throws RuntimeException{
		System.out.println("example");
		
	}

}

