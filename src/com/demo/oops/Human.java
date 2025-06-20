package com.demo.oops;

public class Human {
	
	//state of an object
	int height;//0
	
	int weight;//0
	
	int age;//0
	
	String gender;//null
	
	String name;//null
	
	// public com.demo.oops.Human(); compiler will add default constrcor
	
	//behaviour of an object
	public void canSleep() {
		System.out.println("Human can sleep");
	}
	
	//behaviour 1
	public void canEat() {
		System.out.println("Human can eat");
	}
	
	public void m1() {
		System.out.println("height "+height+ " weight:"+weight+ " gender "+gender);
	}

}
