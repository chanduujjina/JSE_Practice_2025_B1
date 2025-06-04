package com.demo.method;

public class palindromeDemo3 {
	
	    static int reverse(int num, int rev) {
	        if (num == 0)
	            return rev;
	        return reverse(num / 10, rev * 10 + num % 10);
	    }

	    public static void main(String[] args) {
	        int num = 121;
	        int reversed = reverse(num, 0);

	        if (num == reversed)
	            System.out.println(num + " is a Palindrome");
	        else
	            System.out.println(num + " is Not a Palindrome");
	    }
	}


	
	
	
	