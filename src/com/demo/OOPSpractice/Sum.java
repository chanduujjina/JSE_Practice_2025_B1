package com.demo.OOPSpractice;

public class Sum {
	public static void main(String[] args) {
		int num = 543;
		int sum = 0;
		while(num != 0) {
			int temp = num%10;
			sum = sum + temp;
			num = num/10;
			
		}
		System.out.println(sum);
	}

}
