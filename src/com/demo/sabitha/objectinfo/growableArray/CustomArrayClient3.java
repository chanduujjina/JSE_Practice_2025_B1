package com.demo.sabitha.objectinfo.growableArray;
public class CustomArrayClient3 {
	public static void main(String args[]) {
		CustomArray3 customArray3=new CustomArray3();
		for(char i='A';i<='Z';i++) {
			customArray3.Addelements(i);
		}
		for(char A:customArray3.getElement()) {
			System.out.println(A);
		}
		System.out.println("-----------------------------------------------------------");
		System.out.println(customArray3.indexof(customArray3.getElement().length-10));
		System.out.println(customArray3.toString());
	}

}
