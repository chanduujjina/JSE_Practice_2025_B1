package com.demo.sabitha.objectinfo.growableArray;

public class CustomArray2Client {
	public static void main(String args[]) {
		CustomArray2 customArray2=new CustomArray2();
		for(float i=1;i<=90;i++) {
			customArray2.Addelements(i);
		}
		for(float f:customArray2.getElement()) {
			System.out.println(f);
		}
		System.out.println("-----------------------------------------------------------");
		System.out.println(customArray2.indexof(customArray2.getElement().length-10));
		System.out.println(customArray2.getClass()+"      "+customArray2.hashCode());
	}
}
