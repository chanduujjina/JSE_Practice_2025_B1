package com.demo.arrayhandler;

public class Demo {
	public static void main(String[] args) {
		String str  ="Appa";
		String str2 = str.toLowerCase();
		String str1 ="";
		for(int i =str2.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
			str1 += str2.charAt(i);
		}
		if(str1.equals(str2)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		System.out.println("");
		int num = 123;
		int rev = 0;
		while(num !=0) {
			int digit = num%10;
			rev = rev *10 + digit;
			num /= 10;
		}
		System.out.println(rev);
	}

	private static void Tolowwercase() {
		// TODO Auto-generated method stub
		
	}



}
