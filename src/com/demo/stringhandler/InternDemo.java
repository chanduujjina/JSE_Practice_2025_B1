package com.demo.stringhandler;

public class InternDemo {
	
	public static void main(String[] args) {
		
		String name1 ="sample";//literal
		
		String name2 = new String("sample");//object way of creation
		
		boolean result1 = name1 == name2;
		
		System.out.println(result1);
		
		
        
		
		String name3 = new String("sample").intern();//object way of creation
		
       boolean result2 = name1 == name3;
		
		System.out.println(result2);
	}

}
