package com.demo.arrayhandler;

public class ThreeDimensionalStaticDemo {
	
	public static void main(String[] args) {
		
		//2 2 2
		//2 blocks,2 rows, 2 coulmns
		int numberArray [][][] = {{{2,2},{2,2}},{{1,2},{3,2}}};
		
		System.out.println("print with legacy for loop:  ");
		for (int i =0;i<numberArray.length;i++) {
			for (int j = 0;j<numberArray[i].length;j++) {
				for (int k =0;k<numberArray[i][j].length;k++) {
					System.out.print(numberArray[i][j][k]+ " ");
				}
				System.out.println();
			}
		}
		
		System.out.println("print with enhanced for loop:  ");
		
		for (int outer[][]: numberArray) {
			for (int inner1 []:outer) {
				for (int num :inner1) {
					System.out.print(num+" ");
				}
				System.out.println();
			}
		}
		
	}

}
