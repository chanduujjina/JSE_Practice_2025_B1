package com.demo.rajasekhar;

public class LogicalAss1Factorial {
	public static void main(String[] args) {
		int a=4;
		long factorial=1;
		for(int i=1;i<=a;i++)
		{
			factorial=factorial * i ;
		}
		System.out.println("Factorial of a Number is: " + factorial);
	}

}
