package com.demo.stringhandler;

public class StringJoinSudhaDemo {
	
	public static void main(String[] args) {
	
		
		
		String nameArray [] = {"Muthyala","Sudhakar"};
		
		String name = "";
		
		String newName = name.join("_", nameArray);
		
		System.out.println(newName);
	}

}
