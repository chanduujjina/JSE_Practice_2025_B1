package com.demo.arrayhandler;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		//static form of creating array

		int numberArray[][] = { { 1, 2, 3 }, { 3, 2, 4 } };
		
		//iterate 2 dimensional array
		
		System.out.println(numberArray[0][0]);
		System.out.println(numberArray[0][1]);
		System.out.println(numberArray[0][2]);
		
		System.out.println("after first row ::");
		
		System.out.println(numberArray[1][0]);
		System.out.println(numberArray[1][1]);
		System.out.println(numberArray[1][2]);
		
		System.out.println("enhanced for loop");
		for (int outer [] : numberArray) {
			for (int number : outer) {
				System.out.print(number+ " ");
			}
			System.out.println();
		}
		
		System.out.println("using legacy for loop");
		
		for (int i =0;i<numberArray.length;i++) {
			for (int j =0;j<numberArray[i].length;j++) {
				System.out.print(numberArray[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
