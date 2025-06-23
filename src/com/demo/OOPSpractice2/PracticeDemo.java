package com.demo.OOPSpractice2;

import com.demo.OOPSpractice.Demo1;

public class PracticeDemo {
	public static void main(String[] args) {
		Demo1 d1 = new Demo1(0);
		
		d1.getid(123);
		d1.getname("abhi");
		int d2 = d1.idprint();
		System.out.println(d2);
		String d3 = d1.idname(); 
		System.out.println(d3);
		
		
	}

}
