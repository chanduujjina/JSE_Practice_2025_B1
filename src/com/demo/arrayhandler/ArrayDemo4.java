package com.demo.arrayhandler;

public class ArrayDemo4 {
	public static void main(String[] args) {
		int arr1 [] = {6,2,3,4};
		
		int val1 = arr1[0];
		System.out.println(val1);
		
		int i = arr1[arr1.length-1];
		System.out.println(i);
		
		for(int j = 0 ; j<arr1.length ; j++) {
			System.out.print(arr1[j] + " ");
		}
		System.out.println(" ");
		System.out.println("another way");
		for (int k : arr1) {
			System.out.print(k + " ");
		}
	}

}
