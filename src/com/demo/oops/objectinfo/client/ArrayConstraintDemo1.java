package com.demo.oops.objectinfo.client;

public class ArrayConstraintDemo1 {
	
	public static void main(String[] args) {
		
		
		int array [] = new int[10];
		
		for (int i = 1;i<=100;i++) {
			array[i] =i;
		}
		
		
		//print the elements
		
		for (int num :array) {
			System.out.println(num);
		}
	}

}
