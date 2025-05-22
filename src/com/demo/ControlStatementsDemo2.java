package com.demo;

public class ControlStatementsDemo2 {
	
	public static void main(String[] args) {
		
		int a = 90;
		
		int b = 100;
		
		int c = 70;
		
		// find the largest number
		
		if (a > b) {//true
			if (a > c) {//true
				System.out.println("a is the larget number");
			}
			else {
				System.out.println("c is the larget number");
			}
		}
		
		else {
			if (b > c) {
				System.out.println("b is the largest");
			}
			
			else {
				System.out.println("c is the largest");
			}
		}
		
		
		
		
	}

}
