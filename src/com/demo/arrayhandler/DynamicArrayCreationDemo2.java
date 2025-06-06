package com.demo.arrayhandler;

public class DynamicArrayCreationDemo2 {
	
	public static void main(String[] args) {
		
		int[] numberArray = addElements(10);
		
		printElements(numberArray);
		
		System.out.println("----------------request 2--------------");
		
      int[] numberArray1 = addElements(50);
		
		printElements(numberArray1);
		
	}

	/**
	 * @param numberArray
	 * Purpose of this method to print the elements
	 */
	private static void printElements(int[] numberArray) {
		
		for (int num : numberArray) {
			System.out.println(num);
		}
		
	}

	/**
	 * @param size
	 * @return
	 * Purpose of this method to add elements to an array
	 */
	private static int [] addElements(int size) {
		int numberArray [] = new int[size];
		
		int count =0;
		for (int i =0;i<numberArray.length;i++) {//0
			numberArray[i] =++count;//numberArray[0] =1
		}
		return numberArray;
	}

}
