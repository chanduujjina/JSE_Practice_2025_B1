package com.demo.Assinment1;
public class Palindrome{
	String rev="";
	String palindromestring(String str)
	{
		for(int i=0;i<str.length();i++) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) 
			System.out.println("Palindrome ");
		else
			System.out.println(" not Palindrome ");
		return palindromestring(rev);
	}
	int revser(int a,int rev1)
	{
		if(a==0)
			return rev1;
		else 
			rev1=(rev1*10)+(a%10);
		return revser(a/10,rev1);
	}
	boolean palindromenumber(int a) {
		int revser1=revser(a,0);
		return a==revser1;
	}
	public static void main(String args[]) {
		/*Palindrome with String*/
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.println("pleace select the option \n1.palindromestring \n 2.palindromenumber");
		int a1=s.nextInt();
		Palindrome o=new  Palindrome();
		if(a1==1) {
			String str="pop";
			o.palindromestring(str);
		}
		else if(a1==2){
		/*Palindrome with Number*/
		int a=151;
		int rev1=0;
		if(o.palindromenumber(a))
			System.out.println("Palindrome ");
		else
			System.out.println("not Palindrome ");
		
		}
		
	}

}
