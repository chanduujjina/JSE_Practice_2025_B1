package com.demo.Assinment2;

public class SecondLargestElementArray {
	public static void main(String args[]) {
	int[] arr=new int[] {3,1,7,2};
	System.out.print("Second LargestElement arrya is "+new SecondLargestElementArray().Largest(arr));
	
	}
	public  int Largest(int arr[]) {
		int largest2=0;
		int largest1=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				largest2=largest1;
				largest1=arr[i];
			}
			if(largest2>largest1) {
				largest1=largest1+largest2-(largest2=largest1);
			}
			
		}
		return largest2;
		
	}
}
