package com.demo.Assignment1;

public class Squaresofarray {
	public static void main(String args[]) {
		int[] arr = {1,2,3,4};
		for(int i = 0; i < arr.length; i++) {
			arr[i] *= arr[i];
		}
		for (int j = 0; j <arr.length; j++) {
			System.out.print(arr[j]+ " ");
		}
	}

}
