package com.demo.rajasekhar.oops;

public class InheritanceDemo1 {
public static void main(String[] args) {
		
		child1 obj1 = new child1();
		obj1.m1();
		obj1.m2();
	}
	
}

class parent1
{
	public void m1()
	{
		System.out.println("This is a parent method m1");
	}
}

class child1 extends parent1
{
	public void m2()
	{
		System.out.println("This is child method m2");
	}
}

