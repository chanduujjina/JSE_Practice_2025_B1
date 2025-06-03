package com.demo.operator;

public class ControlStatementsDemo4 {
	
	public static void main(String[] args) {
		
		int a = 90;
		
		int b = 100;
		
		int c = 70;
		
		if (a > b || a > c) {
			System.out.println("inside if block");
		}
		
		if (!(a > b)){
			System.out.println("inside negation if block");
		}
		
		if ((a > b && a > c) || (b > c && b> a)) {
			System.out.println("inside if loop muti condtion");
		}
		
		
		
		
	}

}
