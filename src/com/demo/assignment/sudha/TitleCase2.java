package com.demo.assignment.sudha;

public class TitleCase2 {
	public static void main(String[] args) {
		String name="hello java";
		
		String[] name2=name.split(" ");
			
		StringBuilder titleCase=new StringBuilder();
		
		for(String name1 : name2) {
			if(!name.isEmpty()) {
				String firstLetter = name1.substring(0,1).toUpperCase();
				String restLetters = name1.substring(1).toLowerCase();
				titleCase.append(firstLetter).append(restLetters).append(" ");
			}
			
		}
		System.out.println(titleCase.toString().trim());
			
		}
		
	}


