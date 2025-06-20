package com.assignment.logical1;

public class FactorialDemo1 {
	
	public static void main(String[] args) {
		
		int number = 10;
		 int Factorial = 1;
		 
		 for (int i = 1; i <=number;i++) {
			 Factorial *=i;
		 }
				
		 System.out.println("Factorial of "+ number +" is:"+ Factorial);
			 
		 }
	}

