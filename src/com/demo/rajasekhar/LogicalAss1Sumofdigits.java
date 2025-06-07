package com.demo.rajasekhar;

public class LogicalAss1Sumofdigits {
	public static void main(String[] args) {
		int a=34;
		int sum=0;
		while(a>0)
		{
			sum=sum+a%10;
			a=a/10;
		}
		System.out.println("Sum of digits in a number: "+sum);
	}

}
