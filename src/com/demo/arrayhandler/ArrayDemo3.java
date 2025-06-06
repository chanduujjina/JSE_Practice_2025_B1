package com.demo.arrayhandler;

public class ArrayDemo3 {
	
	public static void main(String[] args) {
		
		//static form of an array
		
		int numberArray [] = {1,2,3,4,5,6,8};
		
		//iterating an array in reverse order
		for (int i =numberArray.length-1; i>=0; i--) {
			System.out.print(numberArray[i]+ " ");
		}
		
		System.out.println();
		System.out.println("normal way of creating arra");
		
		//enhanced for loop
		for (int num :numberArray) {
			System.out.print(num + " ");
		}
		
		
		
	}

}
