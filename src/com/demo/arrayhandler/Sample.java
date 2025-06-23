package com.demo.arrayhandler;

public class Sample {
	public static void main (String[]args) {
		String str = "Hello java";
		String str1 = new String("Hello java"); 
		System.out.println(str == str1);
		System.out.println(str.equals(str1));
		int[] list1 = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0 ;i<list1.length;i++) {
			if(list1[i]%2 == 0) {
				System.out.println(list1[i]);
				break;
			}
		}
		
		
	}
}
