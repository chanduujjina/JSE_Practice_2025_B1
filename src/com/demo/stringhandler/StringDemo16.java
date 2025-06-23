package com.demo.stringhandler;

public class StringDemo16 {
	public static void main(String[] args) {
		String str = "madam";
		String str1 = "";
		int vowels = 0;
		int constants =0;
		
		for(int i = 0 ; i<str.length(); i++) {
			if(str1.indexOf(str.charAt(i)) == -1) {
				str1 += str.charAt(i);
			}
			
		}
		System.out.println(str1);
		for(char ch : str.toCharArray()) {
			if("aeiou".indexOf(ch) != -1) {
				vowels++;
			}
			else {
				constants++;
			}
		}
		System.out.println(vowels);
		System.out.println(constants);
		System.out.println(str.startsWith("a"));
		
	}
}
