package com.demo.overridding.exception;

import java.io.IOException;

public class Demo7 {
	public static void main(String[] args) {
		Derived5 derived1= new Derived5();
		derived1.m1();
		
		
	}
	

}
class Base5 {
    void m1()throws IOException{
System.out.println("Base");

    }
    
}

class Derived5 extends Base5{
	@Override
	void m1() {
		System.out.println("example");
		
	}

}

