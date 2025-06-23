package com.demo.arrayhandler;

public class arrascending {
	public static void main(String[] args) {
		int [] arr2 = {4,7,2,9,3};
		assen(arr2);
		
	}
	private static void assen(int [] arr1) {
		for(int i = 0; i<arr1.length; i++) {
			for(int j=i+1; j<arr1.length; j++) {
				if(arr1[i]>arr1[j]) {
					int temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
					
				}
			}
		}
		for(int k =0;k<arr1.length;k++) {
			System.out.print(arr1[k] + " ");
		}
	}

}
