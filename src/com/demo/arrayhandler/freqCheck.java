package com.demo.arrayhandler;

public class freqCheck {
	

	public static void main(String[] args) {
		String str1 = new String("abhiram");
		
		char ch = 'a';
		int freq = 0;
		
		for(int i = 0; i< str1.length();i++) {
			if(str1.charAt(i) == ch) {
				freq++;
			}
		}
		System.out.println(freq);
	}

}
