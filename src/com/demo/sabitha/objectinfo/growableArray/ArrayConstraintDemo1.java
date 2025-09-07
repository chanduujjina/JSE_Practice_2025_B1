package com.demo.sabitha.objectinfo.growableArray;
public class ArrayConstraintDemo1 {
	//this problem of array 
	//we can't re assin the memory size 
	public static void main(String args[]) {
		int[] arr=new int[10];
		int count=1;
		//add the elements in the array
		for(int i=0;i<arr.length;i++) {
			arr[i]=count++;
		}
		//print the elements in the array
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");		
		}
		
	}

}
