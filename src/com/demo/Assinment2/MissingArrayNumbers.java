package com.demo.Assinment2;

public class MissingArrayNumbers {
	public static  void main(String args[]) {
		new MissingArrayNumbers().ArrayNumber();
	}
	public void ArrayNumber() {
		int[] arr=new int[] {1,2,4,6};
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]!=arr[i]+1) {
				System.out.println(arr[i]+1+" ");
			}
		}
	}
	

}

