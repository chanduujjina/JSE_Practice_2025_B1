package com.demo.Assinment2;
public class SumOfDigit {
	public static void main(String args[]) {
		int a=123456;
		int sum=0;
		System.out.println("sum of digit ="+new SumOfDigit().Sum(a,sum));
	}
public int Sum(int a,int sum) {
	while(a>0) {
		sum=sum+a%10;
		a=a/10;
	}
	return sum;
}
}
