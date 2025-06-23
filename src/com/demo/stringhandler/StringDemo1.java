package com.demo.stringhandler;

public class StringDemo1 {
	
	public static void main(String[] args) {
		String str = "raj";    // literal way        //Stores in String constant pool
		String str1 =new String("raj");     //by using object  //Stores in heap
		String str2 = "raj";    // String pool
		System.out.println(str2);
		System.out.println(str);
		System.out.println(str == str1);        //evaluates memory location
		System.out.println(str.equals(str2));    // evaluates content
		
		long ph = 9014324692l;
		System.out.println(ph);
		double f = 10.100000000001f;
		System.out.println(f);
		int i = 10;
		int j = 20;
		System.out.println(i == j);
		boolean rajashekar = i > j;
		System.out.println(rajashekar);
		System.out.println(j == 20);
		
		char ch = 'a';
		int i1 = 97;
		char c = (char) i1;
		
		int a = (int) ch;
		System.out.println(a);
		System.out.println(ch);
		System.out.println(c);
		
		
	}

}
