package com.demo.stringhandler;

public class StringDemo5 {
	
	public static void main(String[] args) {
		
		String name  = "Chandua";
		
		char ch1 = name.charAt(0);//method call
		
		System.out.println("ch1:"+ch1);
		
		
		int index1 = name.indexOf('c');
		
		System.out.println("Not existing index value:"+index1);
		
		
       int index2 = name.indexOf('n');
		
		System.out.println("existing char index value:"+index2);
		
		 int index3 = name.indexOf('a');//index of always give the index for first occurance of the charcter
		 
		 System.out.println("first ocuurance for index method");
		 
		 int lastIndexOf = name.lastIndexOf('a');
		 
		 System.out.println("last ocuurance of char a:"+lastIndexOf);
		
	}

}
