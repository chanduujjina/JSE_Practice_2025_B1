package com.demo.oops.polymorphism.revise;

public class AutoBoxing {
	
	public static void main(String[] args) {
		
		//Boxing
		int a = 10;
		
		Integer b = a;
		
		//Unboxing
		
		Integer c = 20;
		
		int d =c;
		
		//Whey your doing unboxing make sure on null fields
		
		Integer e = null;
		if (e != null) {
		int f = e;
		}
	}

}
