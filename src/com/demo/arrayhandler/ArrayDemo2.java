package com.demo.arrayhandler;

public class ArrayDemo2 {
	
	public static void main(String[] args) {
		
		//static form of an array
		
		int numberArray [] = {1,2,3,4,5,6,8};
		
		for (int i =0; i<numberArray.length; i++) {
			System.out.print(numberArray[i]+ " ");
		}
		
		System.out.println();
		
		for (int i =1; i<=numberArray.length-1; i++) {
			System.out.print(numberArray[i] + " ");
		}
		
	}

}
