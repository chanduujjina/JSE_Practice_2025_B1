package com.demo.assignment.sudha;

public class RemoveSpclChar {
	public static void main(String[] args) {
		String name="Java@#21";
		String result="";
		
		for(int  i=0;i<name.length();i++) {
			if(Character.isAlphabetic(name.charAt(i))||Character.isDigit(name.charAt(i))) {
				result += name.charAt(i);
			}
		     
		}
		
		
		System.out.println(result);
		
	}


}