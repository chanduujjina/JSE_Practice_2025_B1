package com.demo.Assinment2;

public class DuplicateElementsArray {
	public static void main(String[] args) {
		int[] arr=new int[] {1,1,2,2,4,3,3,5};
		new  DuplicateElementsArray().Duplicate(arr);
	}
	public void  Duplicate(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int c=0;
			for(int j=i;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					c++;
				}
			}
			if(c!=1) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}
}
