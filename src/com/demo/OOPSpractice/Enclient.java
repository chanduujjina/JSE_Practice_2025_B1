package com.demo.OOPSpractice;

public class Enclient {
	public static void main(String[] args) {
		En en = new En(10);
		System.out.println(en.hashCode());
		En en1 = new En(10);
		System.out.println(en1.hashCode());
		System.out.println(en.hashCode() == en1.hashCode());
		System.out.println(en.equals(en1));
	}

}
