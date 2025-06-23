package com.demo.rajasekhar.oops;

public class PmDemo1 {
public static void main(String[] args) {
		
		child2 obj2 = new child2();
		
		System.out.println(obj2.m1(10, 20));
		System.out.println(obj2.m1(10, 10, 10));

	}
	
}
class parent2
{
	public int m1(int a, int b)
	{
		return a + b;
	}
	
	public int m1(int a, int b, int c)
	{
		return a+b+c;
	}
	
	
	
}
class child2 extends parent2
{
	
	@Override
	public int m1(int a, int b, int c)
	{
		return a*b*c;
	}
}
