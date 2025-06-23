package com.demo.arrayhandler;

public class AcsendingOredr {
	public static void main(String[] args) {
		int[] arr1 = {0,1,1,0,2,2,3,4};
		for(int i = 0 ; i<arr1.length;i++) {
			for(int j = i+1; j<arr1.length;j++) {
				if(arr1[i] > arr1[j]) {
						System.out.print(arr1[i] + " ");
				}
			}
		}
	}

}
