package com.demo.assignment.sudha;

public class TtileCase {
	public static void main(String[] args) {
		
			 String str="hello java";
			 String[] str1=str.split(" ");
			 String result="";
			 for(int i=0;i<str1.length;i++) {
				 String word=str1[i];
				 if(!word.isEmpty()) {
					 String up=word.substring(0,1).toUpperCase();
					 String lo=word.substring(1).toLowerCase();
					 result+=up+lo+" ";
				 }
			 }
			 System.out.println(result.trim());
		}
		
		
	}


