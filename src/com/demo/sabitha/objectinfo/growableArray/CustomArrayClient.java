package com.demo.sabitha.objectinfo.growableArray;
public class CustomArrayClient {
	public static void main(String args[]) {
		CustomArray customArray=new CustomArray();
		for(int i=1;i<=100;i++) {
			customArray.add(++i);
		}
		int [] arra=customArray.getarray();
		for(int i=0;i<arra.length;i++) {
			System.out.println(arra[i]+" ");
		}
		System.out.println("-----------------------------------------------------------");
		System.out.println(customArray.findIndex(customArray.getarray().length-1));
		System.out.println(customArray.toString());
	}

}
