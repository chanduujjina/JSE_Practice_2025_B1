package com.demo.Assinment2;

public class SplitNumberAndString {
	public static void main(String[] args) {
		String str="test 123 test1 234";
		String arr[]=str.split(" ");
		String str1="";
		String str2="";
		for(int i=0;i<arr.length;i++) {
			String str3=arr[i];
			for(int j=0;j<str3.length();j++) {
				char ch=str3.charAt(j);
			if(Character.isLetter(ch)) {
				 str1+=""+ch;
			}
			else {
				str2+=""+ch;
			}
			}
			str1+=" ";
			str2+=" ";
		}
		System.out.println(str1+"");
		System.out.println(str2+"");
		
	}

	

}
