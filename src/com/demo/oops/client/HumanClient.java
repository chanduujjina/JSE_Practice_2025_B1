package com.demo.oops.client;

import com.demo.oops.Human;

public class HumanClient {
	
	public static void main(String[] args) {
		
		//create object for Human using new keyword
		
		Human h1 = new Human();
		
		h1.m1();//method call for instance method
		
		h1.canSleep();
		
		h1.canEat();
		
		//second Object
		Human h2 = new Human();
		
		h2.m1();
		
		h2.canSleep();
		
		h2.canEat();
		
		
	}

}
