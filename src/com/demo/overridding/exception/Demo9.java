package com.demo.overridding.exception;

import java.io.IOException;

public class Demo9 {
	public static void main(String[] args) throws IOException {
		Derived7 derived1= new Derived7();
		derived1.m1();
		
		
	}
	

}
class Base7 {
    void m1()throws IOException{
System.out.println("Base");

    }
    
}

class Derived7 extends Base7{
	@Override
	void m1() throws RuntimeException{
		System.out.println("example");
		
	}

}

