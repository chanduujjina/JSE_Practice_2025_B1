package com.demo.stringhandler;

public class Pratice {
	public static void main(String[] args) {
		int r = revs(4321,0);
		System.out.println(r);
		
		int [] arr2 = {1,5,8,3,9};
		 int res = max(arr2);
		 System.out.println(res);
	}
	private static int max(int [] arr1) {
		int max = arr1[0];
		int min = arr1[0];
		for(int num : arr1) {
			if(num > max) max = num;
			else if (num < min) min = num;
		}
		return max | min;
		
	}
	private static int revs(int num, int rev) {
		int num1 = 4321;
		int rev1 = 0;
		while(num1 != 0) {
			int di = num1 % 10;
			rev1 = rev1 * 10 + di;
			num1 /= 10;
		}
		return rev1;
	}

}
